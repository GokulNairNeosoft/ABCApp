package com.app.catalog.domain.usecase

import com.app.catalog.base.BaseUseCase
import com.app.catalog.data.entity.CatalogRange
import com.app.catalog.data.entity.CatalogType
import com.app.catalog.domain.respository.CatalogRepository
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class GetCatalogRangeUseCase @Inject constructor(private val catalogRepository: CatalogRepository) :
    BaseUseCase<GetCatalogRangeUseCase.Params, List<CatalogRange>>() {

    override suspend fun execute(params: Params): Flow<List<CatalogRange>> {
        return catalogRepository.getCatalogRange(params.catalogType)
            .map { responseList ->
                responseList.filter { item ->
                    item.title.contains(params.searchQuery, ignoreCase = true)
                }
            }

    }

    override val dispatcher: CoroutineDispatcher
        get() = Dispatchers.IO

    data class Params(val catalogType: CatalogType, val searchQuery: String)
}
package com.app.catalog.domain.usecase

import com.app.catalog.base.BaseUseCase
import com.app.catalog.data.entity.Catalog
import com.app.catalog.domain.respository.CatalogRepository
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetCatalogListUseCase @Inject constructor(private val catalogRepository: CatalogRepository) :
    BaseUseCase<Unit, List<Catalog>>() {
    override suspend fun execute(params: Unit): Flow<List<Catalog>> {
        return catalogRepository.getCatalogList()
    }

    override val dispatcher: CoroutineDispatcher
        get() = Dispatchers.IO
}
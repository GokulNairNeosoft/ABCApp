package com.app.catalog.domain.usecase

import com.app.catalog.base.BaseUseCase
import com.app.catalog.data.entity.CatalogRange
import com.app.catalog.domain.model.CatalogAnalysis
import com.app.catalog.domain.respository.CatalogRepository
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetCatalogAnalysisUseCase :
    BaseUseCase<GetCatalogAnalysisUseCase.Params, CatalogAnalysis>() {
    override suspend fun execute(params: Params) = flow {
        requireNotNull(params.catalogRangeList) { "Item list cannot be empty" }
        require(params.catalogRangeList.isNotEmpty()) { "Item list cannot be empty" }

        val occurrence = hashMapOf<Char, Int>()
        for (item in params.catalogRangeList) {
            for (data in item.title) {
                occurrence[data] = (occurrence[data] ?: 0) + 1
            }
        }
        val sortedMap =
            occurrence.toList().sortedByDescending { (_, value) -> value }
                .take(params.analysisOutputCount).toMap()
        emit(
            CatalogAnalysis(
                itemCount = params.catalogRangeList.size,
                characterOccurrences = sortedMap
            )
        )
    }

    override val dispatcher: CoroutineDispatcher
        get() = Dispatchers.Default

    data class Params(
        val catalogRangeList: List<CatalogRange>?,
        val analysisOutputCount: Int = 3
    )
}
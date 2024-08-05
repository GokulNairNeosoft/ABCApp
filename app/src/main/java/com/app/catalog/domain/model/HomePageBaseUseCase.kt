package com.app.catalog.domain.model

import com.app.catalog.domain.usecase.GetCatalogAnalysisUseCase
import com.app.catalog.domain.usecase.GetCatalogListUseCase
import com.app.catalog.domain.usecase.GetCatalogRangeUseCase

data class HomePageBaseUseCase(
    val getCatalogListUseCase: GetCatalogListUseCase,
    val getCatalogRangeUseCase: GetCatalogRangeUseCase,
    val getCatalogAnalysisUseCase: GetCatalogAnalysisUseCase
)
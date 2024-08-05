package com.app.catalog.domain.model

data class CatalogAnalysis(
    val itemCount: Int,
    val characterOccurrences: Map<Char, Int>
)
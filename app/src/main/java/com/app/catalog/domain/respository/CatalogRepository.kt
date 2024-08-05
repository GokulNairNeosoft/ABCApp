package com.app.catalog.domain.respository

import com.app.catalog.data.entity.Catalog
import com.app.catalog.data.entity.CatalogRange
import com.app.catalog.data.entity.CatalogType
import kotlinx.coroutines.flow.Flow

interface CatalogRepository {
    suspend fun getCatalogList(): Flow<List<Catalog>>
    suspend fun getCatalogRange(catalogType: CatalogType): Flow<List<CatalogRange>>
}
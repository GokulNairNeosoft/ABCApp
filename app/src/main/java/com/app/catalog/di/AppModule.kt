package com.app.catalog.di

import com.app.catalog.data.db.DataStore
import com.app.catalog.domain.model.HomePageBaseUseCase
import com.app.catalog.domain.usecase.GetCatalogAnalysisUseCase
import com.app.catalog.domain.usecase.GetCatalogListUseCase
import com.app.catalog.domain.usecase.GetCatalogRangeUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideDataStore(): DataStore {
        return DataStore()
    }

    @Provides
    fun provideHomePageBaseUseCase(
        getCatalogListUseCase: GetCatalogListUseCase,
        getCatalogRangeUseCase: GetCatalogRangeUseCase,
        getCatalogAnalysisUseCase: GetCatalogAnalysisUseCase
    ): HomePageBaseUseCase {
        return HomePageBaseUseCase(
            getCatalogListUseCase = getCatalogListUseCase,
            getCatalogRangeUseCase = getCatalogRangeUseCase,
            getCatalogAnalysisUseCase = getCatalogAnalysisUseCase
        )
    }

    @Provides
    fun provideCatalogAnalysisUseCase(): GetCatalogAnalysisUseCase {
        return GetCatalogAnalysisUseCase()
    }
}
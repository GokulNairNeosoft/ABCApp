package com.app.catalog.di

import com.app.catalog.data.repository.CatalogRepositoryImpl
import com.app.catalog.domain.respository.CatalogRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    abstract fun provideCarouselRepository(carouselRepository: CatalogRepositoryImpl): CatalogRepository
}

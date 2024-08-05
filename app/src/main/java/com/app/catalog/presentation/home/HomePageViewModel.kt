package com.app.catalog.presentation.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.app.catalog.data.entity.Catalog
import com.app.catalog.data.entity.CatalogRange
import com.app.catalog.domain.model.CatalogAnalysis
import com.app.catalog.domain.model.HomePageBaseUseCase
import com.app.catalog.domain.model.Resource
import com.app.catalog.domain.usecase.GetCatalogAnalysisUseCase
import com.app.catalog.domain.usecase.GetCatalogRangeUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomePageViewModel @Inject constructor(
    private val homePageBaseUseCase: HomePageBaseUseCase
) : ViewModel() {

    private val _searchQuery = MutableStateFlow("")
    val searchQuery get() = _searchQuery.asStateFlow()

    private val _catalogList = MutableStateFlow<List<Catalog>>(emptyList())
    val catalogList get() = _catalogList.asStateFlow()

    private val _catalogRange = MutableStateFlow<List<CatalogRange>>(emptyList())
    val catalogRange get() = _catalogRange.asStateFlow()

    private val _catalogAnalysis =
        MutableStateFlow<Resource<CatalogAnalysis>>(Resource.loading())
    val catalogAnalysis get() = _catalogAnalysis.asStateFlow()

    private val _showBottomSheet = MutableStateFlow(false)
    val showBottomSheet get() = _showBottomSheet.asStateFlow()

    private val _catalogRangeLoading = MutableStateFlow(true)
     val catalogRangeLoading get() = _catalogRangeLoading.asStateFlow()


    private var currentCarouselForDisplay = -1

    fun onCarouselChanged(index: Int) {
        currentCarouselForDisplay = index
        _searchQuery.value = ""
        getCatalogRange()
    }

    fun onSearchValueChange(query: String) {
        _searchQuery.value = query
        onSearchTriggered()
    }

    fun onSearchTriggered() {
        getCatalogRange()
    }

    private fun getCatalogList() = viewModelScope.launch {
        homePageBaseUseCase.getCatalogListUseCase(Unit).collect {
            _catalogList.emit(it)
        }
    }

    private fun getCatalogRange() = viewModelScope.launch {
        if (currentCarouselForDisplay < 0 || catalogList.value.isEmpty()) {
            return@launch
        }
        val catalogType = catalogList.value[currentCarouselForDisplay].type
        val param = GetCatalogRangeUseCase.Params(catalogType, searchQuery.value)
        homePageBaseUseCase.getCatalogRangeUseCase(param).onStart {
            _catalogRangeLoading.emit(true)
        }.collect {
            _catalogRangeLoading.emit(false)
            _catalogRange.emit(it)
        }
    }

    fun showBottomSheet() = viewModelScope.launch {
        _showBottomSheet.emit(true)
        startCatalogAnalysis()
    }

    fun hideBottomSheet() = viewModelScope.launch {
        _showBottomSheet.emit(false)
    }

    private fun startCatalogAnalysis() = viewModelScope.launch {
        _catalogAnalysis.emit(Resource.loading())
        val params = GetCatalogAnalysisUseCase.Params(catalogRange.value)
        homePageBaseUseCase.getCatalogAnalysisUseCase(params).catch {
            _catalogAnalysis.emit(Resource.error(it))
        }.collect {
            _catalogAnalysis.emit(Resource.success(it))
        }
    }

    init {
        getCatalogList()
    }

}
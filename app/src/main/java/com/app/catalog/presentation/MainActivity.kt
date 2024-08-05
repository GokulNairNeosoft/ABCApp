package com.app.catalog.presentation


import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.core.view.isVisible
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager2.widget.ViewPager2
import com.app.catalog.R
import com.app.catalog.databinding.ActivityMainBinding
import com.app.catalog.presentation.adapter.CatalogListAdapter
import com.app.catalog.presentation.adapter.CatalogRangeListAdapter
import com.app.catalog.presentation.catalog_analysis.CatalogAnalysisBottomSheet
import com.google.android.material.tabs.TabLayoutMediator
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    private val viewModel by viewModels<HomePageViewModel>()

    private val carouselAdapter = CatalogListAdapter()
    private val catalogRangeListAdapter = CatalogRangeListAdapter()

    private val searchTextListener = object : SearchView.OnQueryTextListener {
        override fun onQueryTextSubmit(query: String?): Boolean {
            binding.searchText.clearFocus()
            return true
        }

        override fun onQueryTextChange(newText: String?): Boolean {
            newText?.let { viewModel.onSearchValueChange(newText) }
            return true
        }

    }

    private val onCarouselPageChanged = object : ViewPager2.OnPageChangeCallback() {
        override fun onPageSelected(position: Int) {
            binding.searchText.clearFocus()
            viewModel.onCarouselChanged(position)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initViews()
        setUpObservers()
        setupOnClickListeners()
    }

    private fun initViews() {
        with(binding) {
            viewpagerCarousel.adapter = carouselAdapter
            TabLayoutMediator(
                tabLayoutDotIndicator,
                viewpagerCarousel
            ) { _, _ -> }.attach()

            rvCarouselSubItemList.layoutManager = LinearLayoutManager(this@MainActivity)
            rvCarouselSubItemList.adapter = catalogRangeListAdapter

            searchText.setOnQueryTextListener(searchTextListener)
        }


    }

    private fun setUpObservers() {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                launch {
                    viewModel.catalogList.collectLatest {
                        carouselAdapter.submitList(it)
                    }
                }
                launch {
                    viewModel.catalogRange.collectLatest {
                        catalogRangeListAdapter.submitList(it)
                        with(binding.tvCatalogRangeStatus) {
                            isVisible = it.isNullOrEmpty()
                            text =
                                if (it == null) getString(R.string.txt_loading) else getString(R.string.txt_no_item_found)
                        }
                    }
                }
                launch {
                    viewModel.searchQuery.collectLatest {
                        binding.searchText.setQuery(it, false)
                    }
                }
                launch {
                    viewModel.showBottomSheet.collectLatest {
                        val analysisSheet = CatalogAnalysisBottomSheet()
                        analysisSheet.show(supportFragmentManager, CatalogAnalysisBottomSheet.TAG)
                    }
                }
            }
        }
    }

    private fun setupOnClickListeners() {
        binding.fbShowOptions.setOnClickListener {
            viewModel.showBottomSheet()
        }
        with(binding.searchText) {
            setOnClickListener {
                isIconified = false
                requestFocus()
            }
        }
    }

    override fun onResume() {
        super.onResume()
        binding.viewpagerCarousel.registerOnPageChangeCallback(onCarouselPageChanged)
    }

    override fun onPause() {
        super.onPause()
        binding.viewpagerCarousel.unregisterOnPageChangeCallback(onCarouselPageChanged)
    }
}

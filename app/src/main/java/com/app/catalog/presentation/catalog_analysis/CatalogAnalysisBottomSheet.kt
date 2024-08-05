package com.app.catalog.presentation.catalog_analysis

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.app.catalog.R
import com.app.catalog.databinding.CatalogAnalysisBottomSheetBinding
import com.app.catalog.domain.model.CatalogAnalysis
import com.app.catalog.domain.model.ResourceState
import com.app.catalog.presentation.HomePageViewModel
import com.app.catalog.utils.gone
import com.app.catalog.utils.visible
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch


@AndroidEntryPoint
class CatalogAnalysisBottomSheet : BottomSheetDialogFragment() {

    private var _binding: CatalogAnalysisBottomSheetBinding? = null
    private val binding: CatalogAnalysisBottomSheetBinding get() = _binding!!

    private val homeViewModel: HomePageViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = CatalogAnalysisBottomSheetBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewLifecycleOwner.lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                homeViewModel.catalogAnalysis.collect {
                    when (it.status) {
                        ResourceState.LOADING -> {
                            binding.groupDataContent.gone()
                            binding.tvLoadingErrorStatus.visible()
                            binding.tvLoadingErrorStatus.text =
                                it.error ?: getString(R.string.txt_loading)
                        }

                        ResourceState.SUCCESS -> {
                            binding.groupDataContent.visible()
                            binding.tvLoadingErrorStatus.gone()
                            onDataReceived(it.data!!)
                        }

                        ResourceState.ERROR -> {
                            binding.groupDataContent.gone()
                            binding.tvLoadingErrorStatus.visible()
                            binding.tvLoadingErrorStatus.text =
                                it.error ?: getString(R.string.txt_error_occurred)
                        }
                    }
                }
            }
        }
    }

    private fun onDataReceived(data: CatalogAnalysis) {
        with(binding) {
            tvItemCount.text = getString(R.string.txt_item_count, data.itemCount)
            tvContent.text = data.characterOccurrences.toString()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    companion object {
        const val TAG = "CatalogAnalysisBottomSheet"
    }
}
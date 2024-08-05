package com.app.catalog.presentation.home

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.SheetState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.app.catalog.R
import com.app.catalog.domain.model.CatalogAnalysis
import com.app.catalog.domain.model.Resource
import com.app.catalog.domain.model.ResourceState
import com.app.catalog.presentation.components.AppBottomSheet

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CatalogAnalysisBottomSheet(
    modifier: Modifier = Modifier,
    data: Resource<CatalogAnalysis>,
    onDismiss: () -> Unit,
    bottomSheetState: SheetState
) {
    AppBottomSheet(
        modifier = modifier,
        onDismissRequest = onDismiss,
        sheetState = bottomSheetState
    ) {
        when (data.status) {
            ResourceState.LOADING -> Text(stringResource(R.string.txt_loading))
            ResourceState.SUCCESS -> {
                Text(text = stringResource(R.string.txt_item_count, data.data?.itemCount ?: 0))
                Text(text = data.data?.characterOccurrences.toString())
            }
            ResourceState.ERROR -> Text(
                text = data.error ?: stringResource(R.string.txt_error_occurred)
            )
        }
    }
}
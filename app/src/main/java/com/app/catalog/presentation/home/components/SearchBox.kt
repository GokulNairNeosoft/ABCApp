package com.app.catalog.presentation.home.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActionScope
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import com.app.catalog.R


@Composable
fun SearchBox(
    modifier: Modifier = Modifier,
    value: String,
    onValueChange: (String) -> Unit,
    singleLine: Boolean = true,
    onSearch: KeyboardActionScope.() -> Unit
) {
    TextField(
        value = value,
        onValueChange = onValueChange,
        singleLine = singleLine,
        placeholder = { Text(text = stringResource(id = R.string.txt_search)) },
        modifier = modifier.fillMaxWidth(),
        leadingIcon = {
            Icon(
                Icons.Default.Search,
                contentDescription = stringResource(id = R.string.txt_search)
            )
        },
        keyboardActions = KeyboardActions(
            onSearch = onSearch
        ),
        keyboardOptions = KeyboardOptions(
            imeAction = ImeAction.Search
        ),
        colors = TextFieldDefaults.colors(
            focusedContainerColor = MaterialTheme.colorScheme.primary.copy(0.1F),
            unfocusedContainerColor = MaterialTheme.colorScheme.primary.copy(0.1F),
            unfocusedIndicatorColor = Color.Transparent,
            focusedIndicatorColor = Color.Transparent,
        ),
        shape = RoundedCornerShape(dimensionResource(id = R.dimen.dp_10)),
    )
}


@Preview(showSystemUi = true)
@Composable
private fun Preview() {
    SearchBox(value = "", onValueChange = {}) {}
}

@Preview(showSystemUi = true)
@Composable
private fun PreviewWithText() {
    SearchBox(value = "Spinach", onValueChange = {}) {}
}
package com.durand.appinstagramclone.profile.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ProfileDescription(
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier.fillMaxWidth()) {
        Text(text = "josuedurand1924", fontWeight = FontWeight.Bold)
        Text(text = "Description")
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileDescriptionPreview() {
    ProfileDescription()
}
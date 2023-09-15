package com.durand.appinstagramclone.profile.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun ProfileInformation(
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        AsyncImage(
            model = "https://via.placeholder.com/200",
            contentDescription = "profile image",
            modifier = Modifier.clip(CircleShape)
        )
        Row(modifier = modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
            ProfileInformationItem(14, "Publicaciones")
            ProfileInformationItem(200, "Seguidores")
            ProfileInformationItem(500, "Seguidos")
        }
    }
}

@Composable
private fun ProfileInformationItem(
    amount: Int,
    type: String,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = amount.toString(), fontWeight = FontWeight.Bold)
        Text(text = type)
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileInformationPreview() {
    ProfileInformation()
}
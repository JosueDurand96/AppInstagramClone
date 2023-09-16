package com.durand.appinstagramclone.profile.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun ProfilePost(
    post: List<String>, modifier: Modifier = Modifier
) {
    LazyVerticalGrid(modifier = modifier, columns = GridCells.Fixed(3)) {
        items(post.size) {
            PostItem(imageUrl = post[it], modifier = modifier.padding(1.dp))
        }
    }
}

@Composable
private fun PostItem(
    imageUrl: String, modifier: Modifier = Modifier
) {
    Box(modifier = modifier) {
        AsyncImage(model = imageUrl, contentDescription = "user post")
    }

}

@Preview(showBackground = true)
@Composable
fun ProfilePostPreview() {
    ProfilePost(emptyList())
}
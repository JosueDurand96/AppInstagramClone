package com.durand.appinstagramclone.profile.components

import android.widget.Space
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.durand.appinstagramclone.profile.Story

@Composable
fun ProfileStoryHighlight(
    stories: List<Story>,
    modifier: Modifier = Modifier
) {
    LazyRow(modifier = modifier) {
        items(stories) {
            StoryItem(it)
            Spacer(modifier = Modifier.width(7.dp))
        }
    }
}

@Composable
fun StoryItem(
    stories: Story,
    modifier: Modifier = Modifier,
) {
    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        AsyncImage(
            model = stories.image,
            contentDescription = "story image",
            modifier = Modifier.clip(CircleShape)
        )
        Text(text = stories.text)
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileStoryHighlightPreview() {
    ProfileStoryHighlight(emptyList())
}
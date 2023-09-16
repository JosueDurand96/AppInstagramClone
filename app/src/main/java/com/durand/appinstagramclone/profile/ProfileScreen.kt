package com.durand.appinstagramclone.profile

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.durand.appinstagramclone.profile.components.*

@Composable
fun ProfileScreen() {
    val user = User(
        "josuedurand1924",
        "https://via.placeholder.com/200",
        14,
        20,
        300,
        "Josue Durand",
        "I´m mobile developer. ",
        stories = listOf(
            Story("https://via.placeholder.com/200", "Story 1"),
            Story("https://via.placeholder.com/200", "Story 2"),
            Story("https://via.placeholder.com/200", "Story 3"),
            Story("https://via.placeholder.com/200", "Story 4"),
            Story("https://via.placeholder.com/200", "Story 5"),
            Story("https://via.placeholder.com/200", "Story 6"),
            Story("https://via.placeholder.com/200", "Story 7"),
            Story("https://via.placeholder.com/200", "Story 8"),
            Story("https://via.placeholder.com/200", "Story 9"),
            Story("https://via.placeholder.com/200", "Story 10")
        )
    )
    Column {
        ProfileHeader(
            username = user.username,
            backClick = {},
            notificationClick = {},
            optionClick = {},
        )
        ProfileInformation(
            profileUrl = user.profileUrl,
            post = user.post,
            followers = user.followers,
            following = user.following,
            modifier = Modifier.padding(start = 16.dp)
        )
        ProfileDescription(
            name = user.name,
            description = user.description,
            modifier = Modifier.padding(
                start = 16.dp,
                end = 16.dp,
                top = 8.dp,
                bottom = 8.dp
            )
        )
        ProfileActions(
            modifier = Modifier.padding(
                start = 16.dp,
                end = 16.dp,
            )
        )
        ProfileStoryHighlight(
            stories = user.stories,
            modifier = Modifier.padding(
                start = 16.dp,
                end = 16.dp,
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview() {
    ProfileScreen()
}

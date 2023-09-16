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
            Story("https://via.placeholder.com/200", "Story 10"),
            Story("https://via.placeholder.com/200", "Story 11"),
            Story("https://via.placeholder.com/200", "Story 12"),
            Story("https://via.placeholder.com/200", "Story 13"),
            Story("https://via.placeholder.com/200", "Story 14"),
            Story("https://via.placeholder.com/200", "Story 15"),
            Story("https://via.placeholder.com/200", "Story 16"),
            Story("https://via.placeholder.com/200", "Story 17"),
            Story("https://via.placeholder.com/200", "Story 18"),
            Story("https://via.placeholder.com/200", "Story 19"),
            Story("https://via.placeholder.com/200", "Story 20")
        ),
        post = listOf(
            "https://www.dzoom.org.es/wp-content/uploads/2017/07/seebensee-2384369.jpg",
            "https://www.mundodeportivo.com/alfabeta/hero/2023/03/image-2023-03-23t222927.291.jpg?width=1200&aspect_ratio=16:9",
            "https://images.alphacoders.com/598/thumb-1920-598846.jpg",
            "https://media.licdn.com/media/AAYQAQSOAAgAAQAAAAAAAB-zrMZEDXI2T62PSuT6kpB6qg.png",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
            "https://via.placeholder.com/1000",
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
            post = user.post.size ,
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
                top = 6.dp
            )
        )
        ProfilePost(
            post = user.post,
            modifier = Modifier.padding(
                top = 1.5.dp
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview() {
    ProfileScreen()
}

package com.durand.appinstagramclone.profile

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.durand.appinstagramclone.profile.components.ProfileDescription
import com.durand.appinstagramclone.profile.components.ProfileHeader
import com.durand.appinstagramclone.profile.components.ProfileInformation

@Composable
fun ProfileScreen() {
    Column() {
        ProfileHeader(
            backClick = {},
            notificationClick = {},
            optionClick = {}
        )
        ProfileInformation(modifier = Modifier.padding(start = 16.dp))
        ProfileDescription(
            modifier = Modifier.padding(
                start = 16.dp,
                end = 16.dp,
                top = 8.dp,
                bottom = 8.dp
            )
        )
    }

}

@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview() {
    ProfileScreen()
}

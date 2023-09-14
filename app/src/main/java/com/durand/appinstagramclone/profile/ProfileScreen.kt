package com.durand.appinstagramclone.profile

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
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
        ProfileInformation()
    }

}

@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview() {
    ProfileScreen()
}

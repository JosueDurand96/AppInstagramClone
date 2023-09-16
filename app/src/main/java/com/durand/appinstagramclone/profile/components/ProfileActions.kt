package com.durand.appinstagramclone.profile.components

import android.provider.ContactsContract.Profile
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ProfileActions(
    modifier: Modifier = Modifier
) {
    Row(modifier = modifier.fillMaxWidth()) {
        ProfileButton(onClick = {}, message = "Seguir", modifier = Modifier.weight(1f))
        Spacer(modifier = Modifier.width( 5.dp))
        ProfileButton(onClick = {}, message = "Mensaje", modifier = Modifier.weight(1f))
    }

}

@Composable
fun ProfileButton(
    onClick: () -> Unit,
    message: String,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.LightGray
        ),
        shape = RoundedCornerShape(10.dp),
        modifier = modifier
    ) {
        Text(text = message)
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileActionsPreview() {
    ProfileActions()
}
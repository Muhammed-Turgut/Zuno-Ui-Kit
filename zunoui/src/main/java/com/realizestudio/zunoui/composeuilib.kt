package com.realizestudio.zunoui

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun CoolButton(
    text: String = "Click Me!",
    onClick: () -> Unit
) {
    Button(onClick = onClick) {
        Text(text)
    }
}

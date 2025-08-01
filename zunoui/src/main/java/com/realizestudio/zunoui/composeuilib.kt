package com.realizestudio.zunoui

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
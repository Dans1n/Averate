package com.ivan.averate.core.presentation

import androidx.compose.runtime.Composable

@Composable
expect fun AverateTheme(
    darkTheme: Boolean,
    dynamicColor: Boolean,
    content: @Composable () -> Unit
)
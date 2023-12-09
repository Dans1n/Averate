package com.ivan.averate

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import com.ivan.averate.core.presentation.AverateTheme
import com.ivan.averate.weeks.presentation.WeeksListScreen
import com.ivan.averate.weeks.presentation.WeeksListViewModel
import dev.icerock.moko.mvvm.compose.getViewModel
import dev.icerock.moko.mvvm.compose.viewModelFactory

@Composable
fun App(
    darkTheme: Boolean,
    dynamicColor: Boolean
) {
    AverateTheme(
        darkTheme = darkTheme,
        dynamicColor = dynamicColor
    ) {
        val viewModel = getViewModel(
            key = "weeks-list-screen",
            factory = viewModelFactory {
                WeeksListViewModel()
            }
        )
        val state by viewModel.state.collectAsState()

        Surface(
            modifier = Modifier
                .fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            WeeksListScreen(
                state = state,
                onEvent = viewModel::onEvent
            )
        }
    }
}
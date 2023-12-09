package com.ivan.averate.weeks.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.ivan.averate.weeks.domain.Week
import com.ivan.averate.weeks.domain.WeeksDataSource
import dev.icerock.moko.mvvm.viewmodel.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.stateIn

class WeeksListViewModel(
    private val weeksDataSource: WeeksDataSource
): ViewModel() {

    private val _state = MutableStateFlow(WeeksListState())
    val state = combine(
        _state,
        weeksDataSource.getWeeks()
    ) { state, weeks ->
        state.copy(
            weeks = weeks
        )
    }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000L), WeeksListState())

    var newWeek: Week? by mutableStateOf(null)
        private set

    fun onEvent(event: WeeksListEvent){

    }
}
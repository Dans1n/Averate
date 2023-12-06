package com.ivan.averate.weeks.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.ivan.averate.weeks.domain.Week
import com.ivan.averate.weeks.domain.WeightValues
import dev.icerock.moko.mvvm.viewmodel.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class WeeksListViewModel: ViewModel() {

    private val _state = MutableStateFlow(WeeksListState(
        weeks = weeks
    ))
    val state = _state.asStateFlow()

    var newWeek: Week? by mutableStateOf(null)
        private set

    fun onEvent(event: WeeksListEvent){

    }
}

private val weeks = (1..10).map {
    Week(
        weekDateStart = "1",
        weekDateEnd = "2",
        weightValues = listOf(WeightValues(1, 75f, 2000L), WeightValues(2, 75f, 2000L)),
    )
}
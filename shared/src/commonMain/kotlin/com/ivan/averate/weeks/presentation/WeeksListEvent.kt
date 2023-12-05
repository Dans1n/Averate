package com.ivan.averate.weeks.presentation

sealed interface WeeksListEvent {
    data object OnAddNewWeek: WeeksListEvent
    data object DismissWeek: WeeksListEvent
    data class OnWeekDateStartChanged(val dateStart: String): WeeksListEvent
    data class OnDailyWeightChanged(val weight: Float): WeeksListEvent
    data class OnDailyCaloriesChanged(val calories: Long): WeeksListEvent
    data class OnDescriptionChanged(val description: String): WeeksListEvent
    data object DeleteWeek: WeeksListEvent
}
package com.ivan.averate.weeks.presentation

import com.ivan.averate.weeks.domain.Week

data class WeeksListState(
    val weeks: List<Week> = emptyList(),
    val currentWeek: Week? = null,
    val isAddWeekSheetOpen: Boolean = false
)

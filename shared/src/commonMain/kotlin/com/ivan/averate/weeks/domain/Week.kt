package com.ivan.averate.weeks.domain

data class Week(
    val weekDateStart: String,
    val weekDateEnd: String,
    val weightValues: List<WeightValues>,
    val averageWeight: Float,
    val totalCalories: Long,
    val description: String
)

data class WeightValues(
    val dayNumber: Int,
    val weight: Float,
    val calories: Long
)

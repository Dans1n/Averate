package com.ivan.averate.weeks.domain

data class Week(
    val id: Long,
    val weekDateStart: String,
    val weekDateEnd: String,
    val weightValues: List<String>,
    val averageWeight: Double? = null,
    val totalCalories: Long? = null,
    val description: String = ""
)

data class WeightValues(
    val dayNumber: Int,
    val weight: Float,
    val calories: Long
)

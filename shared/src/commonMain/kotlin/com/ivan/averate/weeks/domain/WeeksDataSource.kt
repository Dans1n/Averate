package com.ivan.averate.weeks.domain

import kotlinx.coroutines.flow.Flow

interface WeeksDataSource {
    fun getWeeks(): Flow<List<Week>>
    suspend fun insertWeek(week: Week)
    suspend fun deleteWeek(id: Long)
}
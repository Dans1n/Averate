package com.ivan.averate.weeks.data

import app.cash.sqldelight.coroutines.asFlow
import app.cash.sqldelight.coroutines.mapToList
import com.ivan.averate.database.AverateDatabase
import com.ivan.averate.weeks.domain.Week
import com.ivan.averate.weeks.domain.WeeksDataSource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class SqlDelightWeekDataSource(
    db: AverateDatabase
): WeeksDataSource {

    private val queries = db.weekQueries
    override fun getWeeks(): Flow<List<Week>> {
        return queries
            .getWeeks()
            .asFlow()
            .mapToList(Dispatchers.IO)
            .map { weekEntitites ->
                weekEntitites.map { weekEntity ->
                    weekEntity.toWeek()
                }
            }
    }

    override suspend fun insertWeek(week: Week) {
        queries.insertWeekEntity(
            id = week.id,
            weekDateStart = week.weekDateStart,
            weekDateEnd = week.weekDateEnd,
            weightValues = week.weightValues.joinToString(),
            averageWeight = week.averageWeight,
            totalCalories = week.totalCalories,
            description = week.description
        )
    }

    override suspend fun deleteWeek(id: Long) {
        TODO("Not yet implemented")
    }

}
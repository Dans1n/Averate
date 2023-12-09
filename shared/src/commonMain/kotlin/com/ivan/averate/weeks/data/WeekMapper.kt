package com.ivan.averate.weeks.data

import com.ivan.averate.weeks.domain.Week
import database.WeekEntity

fun WeekEntity.toWeek(): Week {
    return Week(
        id = id,
        weekDateStart = weekDateStart,
        weekDateEnd = weekDateEnd,
        weightValues = weightValues.split(","),
        averageWeight = averageWeight,
        totalCalories = totalCalories,
        description = description
    )
}
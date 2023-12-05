package com.ivan.averate.weeks.presentation.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.ivan.averate.weeks.domain.Week

@Composable
fun WeekListItem(
    modifier: Modifier,
    week: Week,
){
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        repeat(7){
            DailyWeight()
        }
    }
}

@Composable
fun DailyWeight(){
    Box(
        modifier = Modifier
            .size(20.dp)
            .clip(RoundedCornerShape(9.dp))
            .border(1.dp, MaterialTheme.colors.primary),
        contentAlignment = Alignment.Center
    ) {
        Text("99")
    }
}
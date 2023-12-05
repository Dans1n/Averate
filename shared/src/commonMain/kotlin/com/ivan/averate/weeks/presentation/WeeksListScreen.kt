package com.ivan.averate.weeks.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ivan.averate.weeks.presentation.components.WeekListItem

@Composable
fun WeeksListScreen(
    state: WeeksListState,
    onEvent: (WeeksListEvent) -> Unit
){
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    onEvent(WeeksListEvent.OnAddNewWeek)
                },
                shape = RoundedCornerShape(9.dp)
            ){
                Icon(
                    imageVector = Icons.Rounded.Add,
                    contentDescription = "Add week"
                )
            }
        }
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize(),
            contentPadding = PaddingValues(20.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {

            items(state.weeks){ week ->
                WeekListItem(
                    modifier = Modifier
                        .fillMaxWidth(),
                    week = week
                )
            }
        }
    }
}
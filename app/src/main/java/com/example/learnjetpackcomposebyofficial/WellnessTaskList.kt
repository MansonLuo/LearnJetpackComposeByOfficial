package com.example.learnjetpackcomposebyofficial

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Modifier



@Composable
fun WellnessTaskList(
    modifier: Modifier = Modifier,
    list: SnapshotStateList<WellnessTask>,
    onCloseTask: (WellnessTask) -> Unit
) {
    LazyColumn(
        modifier = modifier
    ) {
        items(
            list,
            key = { item -> item.id }
        ) {task ->
            WellnessTaskItem(
                taskName = task.label,
                onClose = {
                    onCloseTask(task)
                }
            )
        }
    }
}
package com.example.myguide.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "checklist_items")
data class ChecklistItem(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val placeId: Long,
    val text: String,
    val isChecked: Boolean = false
)
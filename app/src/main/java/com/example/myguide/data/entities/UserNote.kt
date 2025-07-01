package com.example.myguide.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_notes")
data class UserNote(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val placeId: Long,
    val title: String,
    val content: String,
    val date: String
)
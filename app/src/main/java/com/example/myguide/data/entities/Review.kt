package com.example.myguide.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "reviews")
data class Review(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val placeId: Long,
    val text: String,
    val rate: Float,
    val date: String
)

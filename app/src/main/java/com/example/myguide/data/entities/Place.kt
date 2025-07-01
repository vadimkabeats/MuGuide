package com.example.myguide.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "places")
data class Place(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val name: String,
    @ColumnInfo(name = "city_id")
    val cityId: Long,
    @ColumnInfo(name = "category_id")
    val categoryId: Long,
    val lat: Double,
    val lon: Double,
    val photoPath: String?,
    val description: String?,
    val rate: Float?
)

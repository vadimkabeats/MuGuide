package com.example.myguide.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "countries")
data class Country(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val name: String,
    val flagPath: String?,      // путь к файлу-флагу
    val description: String?
)

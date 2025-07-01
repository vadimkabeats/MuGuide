package com.example.myguide.data.dao

import androidx.lifecycle.LiveData
import androidx.room.*

import com.example.myguide.data.entities.Country

@Dao
interface CountryDao {
    @Query("SELECT * FROM countries")
    fun getAllCountries(): LiveData<List<Country>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(country: Country): Long

    @Update
    suspend fun update(country: Country)

    @Delete
    suspend fun delete(country: Country)
}

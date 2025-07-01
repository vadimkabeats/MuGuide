package com.example.myguide.data.dao

import androidx.lifecycle.LiveData
import androidx.room.*

import com.example.myguide.data.entities.City

@Dao
interface CityDao {
    @Query("SELECT * FROM cities WHERE country_id = :countryId")
    fun getCitiesForCountry(countryId: Long): LiveData<List<City>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(city: City): Long

    @Update
    suspend fun update(city: City)

    @Delete
    suspend fun delete(city: City)
}

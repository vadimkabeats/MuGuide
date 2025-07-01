package com.example.myguide.data.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.myguide.data.entities.Place

@Dao
interface PlaceDao {
    @Query("SELECT * FROM places WHERE city_id = :cityId")
    fun getPlacesForCity(cityId: Long): LiveData<List<Place>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(place: Place): Long

    @Update
    suspend fun update(place: Place)

    @Delete
    suspend fun delete(place: Place)
}
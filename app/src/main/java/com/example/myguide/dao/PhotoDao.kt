package com.example.myguide.data.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.myguide.data.entities.Photo

@Dao
interface PhotoDao {
    @Query("SELECT * FROM photos WHERE placeId = :placeId")
    fun getPhotosForPlace(placeId: Long): LiveData<List<Photo>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(photo: Photo): Long

    @Delete
    suspend fun delete(photo: Photo)
}
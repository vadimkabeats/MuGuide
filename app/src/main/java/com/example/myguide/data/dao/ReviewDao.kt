package com.example.myguide.data.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.myguide.data.entities.Review

@Dao
interface ReviewDao {
    @Query("SELECT * FROM reviews WHERE placeId = :placeId")
    fun getReviewsForPlace(placeId: Long): LiveData<List<Review>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(review: Review): Long

    @Update
    suspend fun update(review: Review)

    @Delete
    suspend fun delete(review: Review)
}
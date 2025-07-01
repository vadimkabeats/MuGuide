package com.example.myguide.data.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.myguide.data.entities.ChecklistItem

@Dao
interface ChecklistItemDao {
    @Query("SELECT * FROM checklist_items WHERE placeId = :placeId")
    fun getItemsForPlace(placeId: Long): LiveData<List<ChecklistItem>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(item: ChecklistItem): Long

    @Update
    suspend fun update(item: ChecklistItem)

    @Delete
    suspend fun delete(item: ChecklistItem)
}

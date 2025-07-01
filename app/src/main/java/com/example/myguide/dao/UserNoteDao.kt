package com.example.myguide.data.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.myguide.data.entities.UserNote

@Dao
interface UserNoteDao {
    @Query("SELECT * FROM user_notes WHERE placeId = :placeId")
    fun getNotesForPlace(placeId: Long): LiveData<List<UserNote>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(note: UserNote): Long

    @Update
    suspend fun update(note: UserNote)

    @Delete
    suspend fun delete(note: UserNote)
}
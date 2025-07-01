package com.example.myguide.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.example.myguide.data.entities.RoutePlaceCrossRef

@Dao
interface RoutePlaceCrossRefDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(crossRef: RoutePlaceCrossRef)

    @Delete
    suspend fun delete(crossRef: RoutePlaceCrossRef)
}

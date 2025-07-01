package com.example.myguide.data.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.myguide.data.entities.Route

@Dao
interface RouteDao {
    @Query("SELECT * FROM routes")
    fun getAllRoutes(): LiveData<List<Route>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(route: Route): Long

    @Update
    suspend fun update(route: Route)

    @Delete
    suspend fun delete(route: Route)
}
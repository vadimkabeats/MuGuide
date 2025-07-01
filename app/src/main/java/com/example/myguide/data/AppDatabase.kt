package com.example.myguide.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.myguide.data.dao.*
import com.example.myguide.data.entities.*

@Database(
    entities = [
        Country::class,
        City::class,
        Category::class,
        Place::class,
        Route::class,
        RoutePlaceCrossRef::class,
        Review::class,
        Photo::class,
        ChecklistItem::class,
        UserNote::class
    ],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun countryDao(): CountryDao
    abstract fun cityDao(): CityDao
    abstract fun categoryDao(): CategoryDao
    abstract fun placeDao(): PlaceDao
    abstract fun routeDao(): RouteDao
    abstract fun routePlaceCrossRefDao(): RoutePlaceCrossRefDao
    abstract fun reviewDao(): ReviewDao
    abstract fun photoDao(): PhotoDao
    abstract fun checklistItemDao(): ChecklistItemDao
    abstract fun userNoteDao(): UserNoteDao
}

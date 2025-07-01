package com.example.myguide

import android.app.Application
import androidx.room.Room
import com.example.myguide.data.AppDatabase

class MyGuideApp : Application() {

    companion object {
        lateinit var database: AppDatabase
            private set
    }

    override fun onCreate() {
        super.onCreate()
        database = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            "myguide-db"
        ).build()
    }
}

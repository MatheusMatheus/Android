package com.example.uc17201124.aularoom

import android.app.Application
import android.arch.persistence.room.Room

/**
 * Created by uc17201124 on 07/11/2018.
 */
open class MyApplication : Application() {

    companion object {
        var database: AppDataBase? = null
    }

    override fun onCreate() {
        super.onCreate()
        //Room
        database = Room.databaseBuilder(this, AppDataBase::class.java, "my-db").allowMainThreadQueries().build()
    }
}

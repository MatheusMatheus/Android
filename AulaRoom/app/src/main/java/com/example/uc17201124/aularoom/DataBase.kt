package com.example.uc17201124.aularoom

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase

/**
 * Created by uc17201124 on 07/11/2018.
 */
@Database(version = 1, entities = arrayOf(Entities.User::class))
abstract class AppDataBase : RoomDatabase() {
    abstract fun userDao() : UserDAO
}
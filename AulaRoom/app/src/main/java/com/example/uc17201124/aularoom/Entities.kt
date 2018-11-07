package com.example.uc17201124.aularoom

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

/**
 * Created by uc17201124 on 07/11/2018.
 */
class Entities {
    @Entity(tableName = "user")
    data class User (
        @PrimaryKey
        var id : Int? = 0,
        var nome : String? = ""
    )
}
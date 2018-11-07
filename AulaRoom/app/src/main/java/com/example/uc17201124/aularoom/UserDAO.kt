package com.example.uc17201124.aularoom

import android.arch.persistence.room.*

/**
 * Created by uc17201124 on 07/11/2018.
 */
@Dao
interface UserDAO {

    @Query("SELECT * FROM user")
    fun getAllUsers(): List<Entities.User>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertUsers(vararg users: Entities.User)

    @Update
    fun updateUser(user: Entities.User)

    @Delete
    fun deleteUser(user: Entities.User)
}
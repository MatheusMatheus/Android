package com.example.uc17201124.aularoom

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user = Entities.User(1, "Matheus")
        MyApplication.database?.userDao()?.insertUsers(user)
        MyApplication.database?.userDao()?.updateUser(user)
        MyApplication.database?.userDao()?.deleteUser(user)
        var resultado = MyApplication.database?.userDao()?.getAllUsers()
    }
}

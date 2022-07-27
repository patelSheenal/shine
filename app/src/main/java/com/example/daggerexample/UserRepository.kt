package com.example.daggerexample

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

interface UserRepository{
    fun saveUser(email: String, password: String)
}

class SQLRepository @Inject constructor() : UserRepository{

    override fun saveUser(email: String, password: String) {
        Log.d("Email", "User Saved in DB")
    }
}

class FirebaseRepository: UserRepository{
    override fun saveUser(email: String, password: String) {
        Log.d("Email", "User Saved in Firebase")
    }

}
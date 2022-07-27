package com.example.daggerexample

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

interface UserRepository{
    fun saveUser(email: String, password: String)
}

@ActivityScope
class SQLRepository @Inject constructor(private val analyticsService: AnalyticsService) : UserRepository{

    override fun saveUser(email: String, password: String) {
        Log.d("Email", "User Saved in DB")
        analyticsService.trackEvent("Save User", "CREATE")
    }
}

class FirebaseRepository(private val analyticsService: AnalyticsService): UserRepository{
    override fun saveUser(email: String, password: String) {
        Log.d("Email", "User Saved in Firebase")
        analyticsService.trackEvent("Save User", "CREATE")
    }

}
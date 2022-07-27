package com.example.daggerexample

import android.util.Log

interface AnalyticsService {

    fun trackEvent(eventName: String, eventType:String)
}

class Mixpanel : AnalyticsService{
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d("Email", "Mixpanel -$eventName - $eventType")
    }

}

class FirebaseAnalytics : AnalyticsService{
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d("Email", "Firebase -$eventName - $eventType")
    }
}
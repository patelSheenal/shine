package com.example.daggerexample

import android.util.Log
import javax.inject.Inject
import javax.inject.Scope
import javax.inject.Singleton

interface NotificationService{
    fun send(to: String, from: String, body: String?)
}


class EmailService @Inject constructor() : NotificationService {

    override fun send(to: String, from: String, body: String?){
        Log.d("Email", "Email Sent")
    }
}

class MessageService(private val retryCount: Int) : NotificationService {
    override fun send(to: String, from: String, body: String?) {
        Log.d("Email", "Message Sent- retryCount = $retryCount")
    }

}
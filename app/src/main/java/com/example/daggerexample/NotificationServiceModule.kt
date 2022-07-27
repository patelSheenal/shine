package com.example.daggerexample

import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class NotificationServiceModule{

    @ActivityScope
    @MessageQualifier
    @Provides
    fun getMessageService(retryCount: Int): NotificationService {
        return MessageService(retryCount)
    }

    @EmailQualifier
    @Provides
    fun getEmailService(emailService: EmailService): NotificationService{
        return emailService
    }
}
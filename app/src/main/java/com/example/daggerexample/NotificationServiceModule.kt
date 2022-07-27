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
    fun getMessageService(): NotificationService {
        return MessageService(4)
    }

    @EmailQualifier
    @Provides
    fun getEmailService(emailService: EmailService): NotificationService{
        return emailService
    }
}
package com.example.daggerexample

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class NotificationServiceModule {

    @MessageQualifier
    @Provides
    fun getMessageService(): NotificationService {
        return MessageService()
    }

    @EmailQualifier
    @Provides
    fun getEmailService(emailService: EmailService): NotificationService{
        return emailService
    }
}
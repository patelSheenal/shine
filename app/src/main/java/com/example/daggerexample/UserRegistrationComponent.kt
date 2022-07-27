package com.example.daggerexample

import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = [UserRepositoryModule::class, NotificationServiceModule::class])
interface UserRegistrationComponent {

    fun inject(mainActivity: MainActivity)

    @Subcomponent.Builder
    interface Builder{
        fun build() : UserRegistrationComponent
        fun retryCount(@BindsInstance retryCount: Int) : Builder
        //fun create(@BindsInstance retryCount: Int) : UserRegistrationComponent
    }
}
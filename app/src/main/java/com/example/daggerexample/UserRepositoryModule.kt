package com.example.daggerexample

import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
abstract class UserRepositoryModule {

//    @Provides
//    fun getFirebaseRepository() : UserRepository{
//        return FirebaseRepository()
//    }

/*    @Provides
    fun getSQLRepository(sqlRepository: SQLRepository) : UserRepository {
        return sqlRepository
    }
    As Dagger already knows how to create SQLRepository instance as we have injected so we can use the following
*/
    @ActivityScope
    @Binds
    abstract fun bindsSQLRepository(sqlRepository: SQLRepository): UserRepository

}
package com.example.daggerexample

class UserRegistrationService {

    val userRepository = UserRepository()
    val emailService = EmailService()

    fun registerUser(email: String, password: String){
        userRepository.saveUser(email, password)
        emailService.send(email, "abc.gmail.com", "User Registered")
    }
}
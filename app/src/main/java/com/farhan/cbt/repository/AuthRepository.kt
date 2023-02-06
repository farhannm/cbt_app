package com.farhan.cbt.repository

import com.farhan.cbt.network.AuthApi

class AuthRepository (
    private val api : AuthApi
) : BaseRepository(){

    suspend fun login(
        email : String,
        password : String
    ) = safeApiCall {
        api.login(email, password)
    }

}
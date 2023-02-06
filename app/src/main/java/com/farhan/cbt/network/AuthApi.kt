package com.farhan.cbt.network

import com.farhan.cbt.response.LoginResponse
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface AuthApi {

    @FormUrlEncoded
    @GET("api/login")
    suspend fun login(
        @Field("email") email : String,
        @Field("password") password : String
    ) : LoginResponse
}
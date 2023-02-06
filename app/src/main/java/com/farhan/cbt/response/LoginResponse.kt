package com.farhan.cbt.response

data class LoginResponse(
    val access_token: String,
    val `data`: Data,
    val token_type: String
)
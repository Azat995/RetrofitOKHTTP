package com.example.retrofitokhtttp.rest

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object NetworkModule {

    fun nationalityRetrofit(): Retrofit = Retrofit.Builder()
        .baseUrl("https://api.nationalize.io")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun dummyJsonRetrofit(): Retrofit = Retrofit.Builder()
        .baseUrl("https://dummyjson.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}
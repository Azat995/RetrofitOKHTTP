package com.example.retrofitokhtttp.rest

import com.example.retrofitokhtttp.model.NationalityResponseModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NationalityApi {

    @GET("/")
    suspend fun getNationality(@Query("name") name: String): Response<NationalityResponseModel>


//    @POST("authentication/login/")
//    suspend fun login(@Body body: LoginRequestModel): Response<Unit>

}
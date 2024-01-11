package com.example.retrofitokhtttp.rest

import com.example.retrofitokhtttp.model.ProductsResponseModel
import retrofit2.Response
import retrofit2.http.GET

interface ProductsApi {

    @GET("products")
    suspend fun getProducts(): Response<ProductsResponseModel>
}
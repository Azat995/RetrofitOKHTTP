package com.example.retrofitokhtttp.rest


object ApiFactory {
    val nationalityApi: NationalityApi = NetworkModule.nationalityRetrofit().create(NationalityApi::class.java)
    val productsApi: ProductsApi = NetworkModule.dummyJsonRetrofit().create(ProductsApi::class.java)
}
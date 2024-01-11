package com.example.retrofitokhtttp.fragments.products

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.retrofitokhtttp.rest.ApiFactory
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ProductsViewModel : ViewModel() {

    private val productsApi = ApiFactory.productsApi

    fun getProducts(successCallback: (products: List<ProductModel>) -> Unit) {
        viewModelScope.launch(Dispatchers.IO) {
            val response = productsApi.getProducts()
            if (response.isSuccessful && response.body() != null) {
                val products: List<ProductModel> = response.body()?.products?.map { it.toModel() } ?: return@launch
                launch(Dispatchers.Main) {
                    successCallback.invoke(products)
                }
            }
        }
    }
}
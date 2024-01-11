package com.example.retrofitokhtttp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.retrofitokhtttp.model.NationalityResponseModel
import com.example.retrofitokhtttp.rest.ApiFactory
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    private val nationalityApi = ApiFactory.nationalityApi

    fun searchNationalityWithName(name: String, resultCallback: (model: NationalityResponseModel) -> Unit) {
        viewModelScope.launch(Dispatchers.IO) {
            val response = nationalityApi.getNationality(name)
            if (response.isSuccessful && response.body() != null) {
                launch(Dispatchers.Main) main@{
                    resultCallback.invoke(response.body() ?: return@main)
                }
            }
        }
    }
}
package com.example.retrofitokhtttp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.SearchView.OnQueryTextListener
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.retrofitokhtttp.databinding.ActivityMainBinding
import com.example.retrofitokhtttp.fragments.products.ProductsFragment
import com.example.retrofitokhtttp.model.NationalityResponseModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val mainViewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setInputListener()
        setClickListener()
    }

    private fun setInputListener() {
        binding.nameSearchView.setOnQueryTextListener(object : OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                mainViewModel.searchNationalityWithName(binding.nameSearchView.query.toString(), ::setResultData)
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                return true
            }
        })
    }

    @SuppressLint("SetTextI18n")
    private fun setResultData(model: NationalityResponseModel): Unit = with(binding) {
        nameTextView.text = "Name: ${model.name}"
        resultCountTextView.text = "Result count: ${model.count}"
        countryTextView.text = "Country: ${model.countries.firstOrNull()?.country?.countryName ?: ""}"
    }

    private fun setClickListener() = with(binding) {
        openProductsButton.setOnClickListener { openFragment(ProductsFragment.getInstance()) }
    }

    private fun openFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().add(R.id.fragments_container_layout, fragment, fragment.javaClass.simpleName)
            .addToBackStack(fragment.javaClass.simpleName).commit()
    }

}
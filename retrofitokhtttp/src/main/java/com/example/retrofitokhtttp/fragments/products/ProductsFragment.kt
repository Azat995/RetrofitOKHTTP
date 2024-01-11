package com.example.retrofitokhtttp.fragments.products

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.retrofitokhtttp.databinding.FragmentProductsBinding

class ProductsFragment : Fragment() {

    companion object {
        fun getInstance() = ProductsFragment()
    }

    private var _binding: FragmentProductsBinding? = null
    private val binding get() = _binding!!
    private val productsViewModel by viewModels<ProductsViewModel>()
    private var productsAdapter: ProductAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        productsAdapter = ProductAdapter()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentProductsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setRecyclerView()
        productsViewModel.getProducts { products ->
            productsAdapter?.submitList(products)
        }
    }

    private fun setRecyclerView() = with(binding.productsRecyclerView) {
        layoutManager = LinearLayoutManager(context)
        adapter = productsAdapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
        productsAdapter = null
    }
}
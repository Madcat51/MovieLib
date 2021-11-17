package com.example.movielibrary.ui.home

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import by.kirich1409.viewbindingdelegate.viewBinding
import site.madcat.movielib.R
import site.madcat.movielib.databinding.FragmentHomeBinding
import site.madcat.movielib.domain.Movie
import site.madcat.movielib.domain.MovieRepository
import site.madcat.movielib.ui.home.HomeAdapter
import site.madcat.movielib.ui.home.HomeContract
import site.madcat.movielib.ui.home.HomeViewModel


class HomeFragment : Fragment(R.layout.fragment_home) {
    private val binding by viewBinding(FragmentHomeBinding::bind)
    private val viewModel: HomeContract.ModelView by viewModels<HomeViewModel>()
    private lateinit var homeRepo: MovieRepository
    private lateinit var recyclerView: RecyclerView
    private var controller: Controller?=null //для того чтоб убить в onDestroy
    private val adapter=HomeAdapter()



    internal interface Controller {
        fun repo(): MovieRepository?
    }


    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is Controller) {
            controller=context
        } else {
            //todo
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }


    override fun onDestroy() {
        controller=null
        super.onDestroy()
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        initData()
    }

    fun initData() {
        controller!!.repo()!!.also { homeRepo=it }
        initRecyclerView()
    }

    fun initRecyclerView() {
        recyclerView=requireActivity().findViewById(R.id.home_fragment_recycler_view)
        recyclerView.setLayoutManager(LinearLayoutManager(context))
        recyclerView.setAdapter(adapter)
        adapter.setData(homeRepo.movie)
        adapter!!.setOnItemClickListener(object : HomeAdapter.IItemClickListener {
            override fun onItemClickListener(movie: Movie) {

            }
        })
    }


}




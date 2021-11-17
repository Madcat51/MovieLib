package com.example.movielibrary.ui.favorites


import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import site.madcat.movielib.R
import site.madcat.movielib.databinding.FragmentFavoritesBinding

class FavoritesFragment : Fragment(R.layout.fragment_favorites) {
    private val binding by viewBinding(FragmentFavoritesBinding::bind)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

}
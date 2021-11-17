package com.example.movielibrary.ui.rating

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import site.madcat.movielib.R
import site.madcat.movielib.databinding.FragmentRatingBinding


class RatingFragment : Fragment(R.layout.fragment_rating) {
    private val binding by viewBinding(FragmentRatingBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}
package site.madcat.movielib.ui.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.movielibrary.ui.home.HomeFragment
import site.madcat.movielib.domain.MovieRepository
import site.madcat.movielib.ui.home.HomeContract

class HomeViewModel: ViewModel(), HomeContract.ModelView {
    private var controller: HomeFragment.Controller?=null //для того чтоб убить в onDestroy

    override val paramsEquals=MutableLiveData<String>()

    internal interface Controller {
        fun repo(): MovieRepository?

    }



}
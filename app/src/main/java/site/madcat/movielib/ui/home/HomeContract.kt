package site.madcat.movielib.ui.home

import androidx.lifecycle.LiveData

class HomeContract {
    enum class State { OK, ERROR }

    interface ModelView {
        val paramsEquals: LiveData<String>



    }
}

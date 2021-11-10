package site.madcat.movielib.ui

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.movielibrary.ui.home.HomeFragment
import site.madcat.movielib.R
import site.madcat.movielib.databinding.ActivityMainBinding
import site.madcat.movielib.domain.Movie
import site.madcat.movielib.domain.MovieRepository


class MainActivity : AppCompatActivity(),HomeFragment.Controller {
    var repository: MovieRepository=MovieRepository()
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        fillRecyclerView()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val navView: BottomNavigationView = binding.navView
        val navController = findNavController(R.id.fragment_container)
        navView.setupWithNavController(navController)


    }

    override fun repo(): MovieRepository? {
        return repository
    }
    private fun fillRecyclerView() {
        repository.addMovie(Movie(1,"qwerw1","1243", 4.4.toLong(),123))
        repository.addMovie(Movie(2,"qwerw2","1234", 4.3.toLong(),12311))
        repository.addMovie(Movie(3,"qwerw3","1294", 4.2.toLong(),123111))
        repository.addMovie(Movie(4,"qwerw4","1834", 4.8.toLong(),12322))
        repository.addMovie(Movie(5,"qwerw5","2234", 4.1.toLong(),1232))
        repository.addMovie(Movie(6,"qwerw6","3234", 4.2.toLong(),1223))
        repository.addMovie(Movie(7,"qwerw7","4234", 4.3.toLong(),12223))
        repository.addMovie(Movie(8,"qwerw8","6234", 4.9.toLong(),12333))

    }
}
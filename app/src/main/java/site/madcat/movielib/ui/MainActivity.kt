package site.madcat.movielib.ui

import android.os.Bundle
import androidx.activity.viewModels

import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity

import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.movielibrary.ui.home.HomeFragment
import site.madcat.movielib.R
import site.madcat.movielib.databinding.ActivityMainBinding
import site.madcat.movielib.domain.Movie
import site.madcat.movielib.domain.MovieRepository
import site.madcat.movielib.ui.home.HomeContract
import site.madcat.movielib.ui.home.HomeViewModel
import java.util.*


class MainActivity : AppCompatActivity(),HomeFragment.Controller {
    var repository: MovieRepository=MovieRepository()
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val navView: BottomNavigationView = binding.navView
        val navController = findNavController(R.id.fragment_container)
        navView.setupWithNavController(navController)
        fillRecyclerView()
    }

    override fun repo(): MovieRepository? {
        return repository
    }


    private fun fillRecyclerView() {
        repository.addMovie(Movie(UUID.randomUUID().toString(),"qwerw1","1243", 4.4.toLong(),123))
        repository.addMovie(Movie(UUID.randomUUID().toString(),"qwerw2","1234", 4.3.toLong(),12311))
        repository.addMovie(Movie(UUID.randomUUID().toString(),"qwerw3","1294", 4.2.toLong(),123111))
        repository.addMovie(Movie(UUID.randomUUID().toString(),"qwerw4","1834", 4.8.toLong(),12322))
        repository.addMovie(Movie(UUID.randomUUID().toString(),"qwerw5","2234", 4.1.toLong(),1232))
        repository.addMovie(Movie(UUID.randomUUID().toString(),"qwerw6","3234", 4.2.toLong(),1223))
        repository.addMovie(Movie(UUID.randomUUID().toString(),"qwerw7","4234", 4.3.toLong(),12223))
        repository.addMovie(Movie(UUID.randomUUID().toString(),"qwerw8","6234", 4.9.toLong(),12333))
        repository.addMovie(Movie(UUID.randomUUID().toString(),"qwerw1","1243", 4.4.toLong(),123))
        repository.addMovie(Movie(UUID.randomUUID().toString(),"qwerw2","1234", 4.3.toLong(),12311))
        repository.addMovie(Movie(UUID.randomUUID().toString(),"qwerw3","1294", 4.2.toLong(),123111))
        repository.addMovie(Movie(UUID.randomUUID().toString(),"qwerw4","1834", 4.8.toLong(),12322))
        repository.addMovie(Movie(UUID.randomUUID().toString(),"qwerw5","2234", 4.1.toLong(),1232))
        repository.addMovie(Movie(UUID.randomUUID().toString(),"qwerw6","3234", 4.2.toLong(),1223))
        repository.addMovie(Movie(UUID.randomUUID().toString(),"qwerw7","4234", 4.3.toLong(),12223))
        repository.addMovie(Movie(UUID.randomUUID().toString(),"qwerw8","6234", 4.9.toLong(),12333))
        repository.addMovie(Movie(UUID.randomUUID().toString(),"qwerw1","1243", 4.4.toLong(),123))
        repository.addMovie(Movie(UUID.randomUUID().toString(),"qwerw2","1234", 4.3.toLong(),12311))
        repository.addMovie(Movie(UUID.randomUUID().toString(),"qwerw3","1294", 4.2.toLong(),123111))
        repository.addMovie(Movie(UUID.randomUUID().toString(),"qwerw4","1834", 4.8.toLong(),12322))
        repository.addMovie(Movie(UUID.randomUUID().toString(),"qwerw5","2234", 4.1.toLong(),1232))
        repository.addMovie(Movie(UUID.randomUUID().toString(),"qwerw6","3234", 4.2.toLong(),1223))
        repository.addMovie(Movie(UUID.randomUUID().toString(),"qwerw7","4234", 4.3.toLong(),12223))
        repository.addMovie(Movie(UUID.randomUUID().toString(),"qwerw8","6234", 4.9.toLong(),12333))
        repository.addMovie(Movie(UUID.randomUUID().toString(),"qwerw1","1243", 4.4.toLong(),123))
        repository.addMovie(Movie(UUID.randomUUID().toString(),"qwerw2","1234", 4.3.toLong(),12311))
        repository.addMovie(Movie(UUID.randomUUID().toString(),"qwerw3","1294", 4.2.toLong(),123111))
        repository.addMovie(Movie(UUID.randomUUID().toString(),"qwerw4","1834", 4.8.toLong(),12322))
        repository.addMovie(Movie(UUID.randomUUID().toString(),"qwerw5","2234", 4.1.toLong(),1232))
        repository.addMovie(Movie(UUID.randomUUID().toString(),"qwerw6","3234", 4.2.toLong(),1223))
        repository.addMovie(Movie(UUID.randomUUID().toString(),"qwerw7","4234", 4.3.toLong(),12223))
        repository.addMovie(Movie(UUID.randomUUID().toString(),"qwerw8","6234", 4.9.toLong(),12333))

    }
}
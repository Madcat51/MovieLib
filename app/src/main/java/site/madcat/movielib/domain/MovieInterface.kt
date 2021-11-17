package site.madcat.movielib.domain

import java.io.Serializable

interface MovieInterface:Serializable {
    val movie:List<Movie?>?
    fun addMovie(movie:Movie?):String
    fun editMovie(id:Int,movie:Movie?):Boolean
    fun deleteMovie(id:Int):Boolean
}
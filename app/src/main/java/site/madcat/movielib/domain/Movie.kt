package site.madcat.movielib.domain

import java.io.Serializable

class Movie(id: String, title: String, released: String, ratingFilms: Long, countViews: Int) :
    Serializable {

    var id: String
    var title: String
    var released: String
    var ratingFilms: Long
    var countViews: Int

    fun setID(id: String) {
        this.id = id
    }

    fun getId(id: String): String {
        return id
    }

    init {
       this.id = id
        this.title = title
        this.released = released
        this.ratingFilms = ratingFilms
        this.countViews = countViews
    }
}
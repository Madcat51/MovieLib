package site.madcat.movielib.domain

import java.io.Serializable

class Movie(id: Int, title: String, released: String, ratingFilms: Long, countViews: Int) :
    Serializable {

    var id: Int
    var title: String
    var released: String
    var ratingFilms: Long
    var countViews: Int

    fun setID(id: Int) {
        this.id = id
    }

    fun getId(id: Int): Int {
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
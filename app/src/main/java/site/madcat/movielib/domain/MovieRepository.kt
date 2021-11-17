package site.madcat.movielib.domain

class MovieRepository:MovieInterface {


    var cash: ArrayList<Movie> = ArrayList<Movie>()
  private var counter = 0

    override val movie: List<Movie?>
        get() = ArrayList(cash)

    override fun addMovie(movie: Movie?): String {
        val newId = ++counter
        movie!!.setID(newId.toString())
        cash.add(movie)
        return newId.toString()
    }

    override fun editMovie(id: Int, movie: Movie?): Boolean {
        deleteMovie(id)
        movie!!.setID(id.toString())
        cash.add(movie)
        return true
    }

    override   fun deleteMovie(id: Int): Boolean {
        for (i in cash.indices) {
            if (cash[i].getId(id.toString()).equals(id)) {
                cash.removeAt(i)
                return true
            }
        }
        return false
    }

    fun getMovie(): Any? {
        return ArrayList<Any?>(cash)
    };









}
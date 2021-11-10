package site.madcat.movielib.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import site.madcat.movielib.R
import site.madcat.movielib.domain.Movie
import site.madcat.movielib.ui.MovieVH
import java.util.ArrayList

class HomeAdapter : RecyclerView.Adapter<MovieVH>() {
    private var data: List<Movie> = ArrayList<Movie>()
    private var clickListener: onItemClickListener? = null

    fun setData(data: List<Movie?>) {
        this.data = data as List<Movie>

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieVH {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_move, parent, false)
        return MovieVH(view)
    }

    override fun onBindViewHolder(holder: MovieVH, position: Int) {
        val movie: Movie = getItem(position)
        holder.itemView.setOnClickListener { v -> clickListener?.onItemClick(movie) }
        holder.titleTextView.text=(movie.title)
        holder.releasedTextView.text=(movie.released)

    }

    override fun getItemCount(): Int {
        return data.size
    }

    private fun getItem(position: Int): Movie {
        return data[position]
    }

    fun setOnItemClickListener(listener: onItemClickListener) {
        clickListener = listener
    }

    interface onItemClickListener {
        fun onItemClick(item: Movie?)
    }
}
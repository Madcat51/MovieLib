package site.madcat.movielib.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import site.madcat.movielib.R
import site.madcat.movielib.domain.Movie
import java.util.ArrayList

class HomeAdapter : RecyclerView.Adapter<HomeMovieVH>() {
    private var data: MutableList<Movie> = ArrayList<Movie>()
    private var itemClickListener: IItemClickListener? = null

    override fun onBindViewHolder(holder: HomeMovieVH, position: Int)
    {
        val movie: Movie = getItem(position)
             holder.titleTextView.text=(movie.title)
        holder.releasedTextView.text=(movie.released+" "+movie.id)
        holder.titleTextView.setOnClickListener {
            itemClickListener!!.onItemClickListener(movie)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeMovieVH {
        val view: View =LayoutInflater.from(parent.context).inflate(R.layout.item_move, parent, false)
        return HomeMovieVH(view)
    }
    fun setData(data: List<Movie?>) {
        this.data = data as MutableList<Movie>

    }

    override fun getItemCount() = data.size

    private fun getItem(position: Int): Movie {
        return data[position]
    }
    fun setOnItemClickListener(itemClickListener: IItemClickListener) {
        this.itemClickListener = itemClickListener

    }
    interface IItemClickListener {
        fun onItemClickListener(movie: Movie)
    }


}
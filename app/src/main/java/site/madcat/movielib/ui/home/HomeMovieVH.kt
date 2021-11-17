package site.madcat.movielib.ui.home

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import site.madcat.movielib.R

class HomeMovieVH(itemView: View) : RecyclerView.ViewHolder(itemView) {
    @JvmField
    var titleTextView = itemView.findViewById<TextView>(R.id.title_text_view)
    var releasedTextView=itemView.findViewById<TextView>(R.id.released_detail_text_view)
}



package site.madcat.movielib.ui

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import site.madcat.movielib.R

class MovieVH(itemView: View) : RecyclerView.ViewHolder(itemView) {
    @JvmField
    var titleTextView = itemView.findViewById<TextView>(R.id.title_text_view)
    var releasedTextView=itemView.findViewById<TextView>(R.id.released_text_view)
}
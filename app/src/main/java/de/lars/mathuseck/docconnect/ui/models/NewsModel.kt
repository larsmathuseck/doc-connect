package de.lars.mathuseck.docconnect.ui.models

import android.view.View
import android.widget.TextView
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.google.android.material.card.MaterialCardView
import de.lars.mathuseck.docconnect.R

@EpoxyModelClass(layout = R.layout.card_news)
abstract class NewsModel : EpoxyModelWithHolder<NewsModel.Holder>() {

    @EpoxyAttribute
    var author: String? = null

    @EpoxyAttribute
    var date: String? = null

    @EpoxyAttribute
    var title: String? = null

    @EpoxyAttribute
    var description: String? = null

    override fun bind(holder: Holder) {
        holder.authorTv.text = author
        holder.dateTv.text = date
        holder.titleTv.text = title
        holder.descTv.text = description

        holder.newsCv.setOnClickListener {

        }
    }

    class Holder : EpoxyHolder() {

        lateinit var newsCv: MaterialCardView
        lateinit var authorTv: TextView
        lateinit var dateTv: TextView
        lateinit var titleTv: TextView
        lateinit var descTv: TextView

        override fun bindView(itemView: View) {
            newsCv = itemView.findViewById(R.id.newsCv)
            authorTv = itemView.findViewById(R.id.newsAuthorTv)
            dateTv = itemView.findViewById(R.id.newsDateTv)
            titleTv = itemView.findViewById(R.id.newsTitleTv)
            descTv = itemView.findViewById(R.id.newsDescTv)
        }
    }


}
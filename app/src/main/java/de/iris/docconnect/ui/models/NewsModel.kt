package de.iris.docconnect.ui.models

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.google.android.material.card.MaterialCardView
import de.iris.docconnect.R

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

    @EpoxyAttribute
    var issuerLogo: Int? = null

    override fun bind(holder: Holder) {
        holder.authorTv.text = author
        holder.dateTv.text = date
        holder.titleTv.text = title
        holder.descTv.text = description
        holder.newsIv.setImageResource(issuerLogo ?: R.drawable.logo_rki)

        holder.newsCv.setOnClickListener {

        }
    }

    class Holder : EpoxyHolder() {

        lateinit var newsCv: MaterialCardView
        lateinit var authorTv: TextView
        lateinit var dateTv: TextView
        lateinit var titleTv: TextView
        lateinit var descTv: TextView
        lateinit var newsIv: ImageView

        override fun bindView(itemView: View) {
            newsCv = itemView.findViewById(R.id.newsCv)
            authorTv = itemView.findViewById(R.id.newsAuthorTv)
            dateTv = itemView.findViewById(R.id.newsDateTv)
            titleTv = itemView.findViewById(R.id.newsTitleTv)
            descTv = itemView.findViewById(R.id.newsDescTv)
            newsIv = itemView.findViewById(R.id.newsIv)
        }
    }


}
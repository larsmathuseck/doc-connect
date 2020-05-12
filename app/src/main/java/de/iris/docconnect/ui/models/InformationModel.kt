package de.iris.docconnect.ui.models

import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import de.iris.docconnect.R

enum class Logo {
    BMG, RKI
}

@EpoxyModelClass(layout = R.layout.card_information)
abstract class InformationModel : EpoxyModelWithHolder<InformationModel.Holder>() {

    @EpoxyAttribute
    var text: String? = null

    @EpoxyAttribute
    var title: String? = null

    @EpoxyAttribute
    var expanded: Boolean = false

    @EpoxyAttribute
    var author: String? = null

    @EpoxyAttribute
    var logo: Logo? = null

    override fun bind(holder: Holder) {
        holder.infoTextTv.text = text
        holder.informationTitleTv.text = title

        if (expanded) {
            holder.infoTextTv.visibility = View.VISIBLE
            holder.expandButton.text = holder.infoTextTv.context.getString(R.string.less)
        } else {
            holder.infoTextTv.visibility = View.GONE
            holder.expandButton.text = holder.infoTextTv.context.getString(R.string.more)
        }

        holder.expandButton.setOnClickListener {
            if (holder.infoTextTv.visibility == View.VISIBLE) {
                holder.infoTextTv.visibility = View.GONE
                holder.expandButton.text = holder.infoTextTv.context.getString(R.string.more)
            } else {
                holder.infoTextTv.visibility = View.VISIBLE
                holder.expandButton.text = holder.infoTextTv.context.getString(R.string.less)
            }
        }

        holder.authorTv.text = author ?: ""

        when (logo) {
            Logo.BMG -> holder.infoLogoIV.setImageDrawable(holder.infoLogoIV.context.getDrawable(R.drawable.bmg_logo))
            Logo.RKI -> holder.infoLogoIV.setImageDrawable(holder.infoLogoIV.context.getDrawable(R.drawable.logo_rki))
            null -> holder.infoLogoIV.setImageDrawable(holder.infoLogoIV.context.getDrawable(R.drawable.bmg_logo))
        }
    }

    class Holder : EpoxyHolder() {

        lateinit var informationTitleTv: TextView
        lateinit var infoTextTv: TextView
        lateinit var expandButton: Button
        lateinit var infoLogoIV: ImageView
        lateinit var authorTv: TextView

        override fun bindView(itemView: View) {
            authorTv = itemView.findViewById(R.id.authorTv)
            expandButton = itemView.findViewById(R.id.expandButton)
            infoTextTv = itemView.findViewById(R.id.infoTextTv)
            informationTitleTv = itemView.findViewById(R.id.informationTitleTv)
            infoLogoIV = itemView.findViewById(R.id.infoLogoIV)
        }
    }


}
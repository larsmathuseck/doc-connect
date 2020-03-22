package de.lars.mathuseck.docconnect.ui.models

import android.view.View
import android.widget.Button
import android.widget.TextView
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import de.lars.mathuseck.docconnect.R

@EpoxyModelClass(layout = R.layout.card_information)
abstract class InformationModel : EpoxyModelWithHolder<InformationModel.Holder>() {

    @EpoxyAttribute
    var text: String? = null

    @EpoxyAttribute
    var title: String? = null

    @EpoxyAttribute
    var expanded: Boolean = false

    override fun bind(holder: Holder) {
        holder.infoTextTv.text = text
        holder.informationTitleTv.text = title

        if (expanded) {
            holder.infoTextTv.visibility = View.VISIBLE
            holder.expandButton.text = "weniger"
        } else {
            holder.infoTextTv.visibility = View.GONE
            holder.expandButton.text = "mehr"
        }

        holder.expandButton.setOnClickListener {
            if (holder.infoTextTv.visibility == View.VISIBLE) {
                holder.infoTextTv.visibility = View.GONE
                holder.expandButton.text = "mehr"
            } else {
                holder.infoTextTv.visibility = View.VISIBLE
                holder.expandButton.text = "weniger"
            }
        }
    }

    class Holder : EpoxyHolder() {

        lateinit var informationTitleTv: TextView
        lateinit var infoTextTv: TextView
        lateinit var expandButton: Button

        override fun bindView(itemView: View) {
            expandButton = itemView.findViewById(R.id.expandButton)
            infoTextTv = itemView.findViewById(R.id.infoTextTv)
            informationTitleTv = itemView.findViewById(R.id.informationTitleTv)
        }
    }


}
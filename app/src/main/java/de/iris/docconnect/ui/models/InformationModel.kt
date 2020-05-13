package de.iris.docconnect.ui.models

import android.view.View
import android.widget.TextView
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import de.iris.docconnect.R
import de.iris.docconnect.utils.getPrintableTimestamp
import java.util.*

@EpoxyModelClass(layout = R.layout.card_information)
abstract class InformationModel : EpoxyModelWithHolder<InformationModel.Holder>() {

    @EpoxyAttribute
    var title: String? = null

    @EpoxyAttribute
    var summary: String? = null

    @EpoxyAttribute
    var author: String? = null

    @EpoxyAttribute
    var date: Date? = null

    @EpoxyAttribute
    var informationId: String? = null

    @EpoxyAttribute
    var callback: ((id: String) -> Unit)? = null

    override fun bind(holder: Holder) {
        holder.informationTitleTv.text = title
        holder.summaryTv.text = summary
        holder.dateTv.text = getPrintableTimestamp(date)
        holder.authorTv.text = author ?: ""
        holder.cardView.setOnClickListener {
            informationId?.let {
                callback?.invoke(it)
            }
        }
    }

    class Holder : EpoxyHolder() {

        lateinit var cardView: View
        lateinit var informationTitleTv: TextView
        lateinit var summaryTv: TextView
        lateinit var dateTv: TextView
        lateinit var authorTv: TextView

        override fun bindView(itemView: View) {
            cardView = itemView.findViewById(R.id.informationCv)
            informationTitleTv = itemView.findViewById(R.id.informationTitleTv)
            summaryTv = itemView.findViewById(R.id.informationSummaryTv)
            dateTv = itemView.findViewById(R.id.informationDateTv)
            authorTv = itemView.findViewById(R.id.authorTv)
        }
    }


}
package de.lars.mathuseck.docconnect.ui.models

import android.view.View
import android.widget.TextView
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import de.lars.mathuseck.docconnect.R


@EpoxyModelClass(layout = R.layout.card_title)
abstract class TitleModel : EpoxyModelWithHolder<TitleModel.Holder>() {

    @EpoxyAttribute
    var title: String? = null

    override fun bind(holder: Holder) {
        holder.titleTv.text = title
    }

    class Holder : EpoxyHolder() {

        lateinit var titleTv: TextView

        override fun bindView(itemView: View) {
            titleTv = itemView.findViewById(R.id.titleTv)
        }
    }

}
package de.iris.docconnect.ui.models

import android.view.View
import android.widget.TextView
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import de.iris.docconnect.R


@EpoxyModelClass(layout = R.layout.card_drop_down)
abstract class DropdownModel : EpoxyModelWithHolder<DropdownModel.Holder>() {

    @EpoxyAttribute
    var displayText: String? = null

    @EpoxyAttribute
    var callback: OnInteractionListener? = null

    override fun bind(holder: Holder) {
        holder.titleTv.text = displayText

        holder.container.setOnClickListener {
            callback?.onDropdownSelected()
        }
    }

    interface OnInteractionListener {
        fun onDropdownSelected()
    }

    class Holder : EpoxyHolder() {

        lateinit var container: View
        lateinit var titleTv: TextView

        override fun bindView(itemView: View) {
            this.container = itemView.findViewById(R.id.dropDownContainer)
            titleTv = itemView.findViewById(R.id.dropdownTv)
        }
    }

}
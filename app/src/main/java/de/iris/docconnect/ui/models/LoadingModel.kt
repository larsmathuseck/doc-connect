package de.iris.docconnect.ui.models

import android.view.View
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import de.iris.docconnect.R

/**
 * The model for the loading card
 */
@EpoxyModelClass
internal abstract class LoadingModel : EpoxyModelWithHolder<LoadingModel.Holder>() {

    override fun getDefaultLayout() = R.layout.card_loading

    override fun bind(holder: Holder) {
    }

    class Holder : EpoxyHolder() {

        override fun bindView(itemView: View) {
        }
    }
}
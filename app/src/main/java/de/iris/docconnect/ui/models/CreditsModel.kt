package de.iris.docconnect.ui.models

import android.view.View
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import de.iris.docconnect.R


@EpoxyModelClass(layout = R.layout.card_credits)
abstract class CreditsModel : EpoxyModelWithHolder<CreditsModel.Holder>() {


    class Holder : EpoxyHolder() {


        override fun bindView(itemView: View) {
        }
    }

}
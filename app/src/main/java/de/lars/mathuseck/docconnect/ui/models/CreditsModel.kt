package de.lars.mathuseck.docconnect.ui.models

import android.view.View
import android.widget.TextView
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import de.lars.mathuseck.docconnect.R


@EpoxyModelClass(layout = R.layout.card_credits)
abstract class CreditsModel : EpoxyModelWithHolder<CreditsModel.Holder>() {


    class Holder : EpoxyHolder() {


        override fun bindView(itemView: View) {
        }
    }

}
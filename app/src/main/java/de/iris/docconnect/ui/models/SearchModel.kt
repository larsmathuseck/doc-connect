package de.iris.docconnect.ui.models

import android.view.View
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import de.iris.docconnect.R


@EpoxyModelClass(layout = R.layout.card_search)
abstract class SearchModel : EpoxyModelWithHolder<SearchModel.Holder>() {


    class Holder : EpoxyHolder() {
        override fun bindView(itemView: View) {

        }

    }

}
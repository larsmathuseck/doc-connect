package de.lars.mathuseck.docconnect.ui.models

import android.view.View
import android.widget.TextView
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.google.android.material.card.MaterialCardView
import de.lars.mathuseck.docconnect.R

@EpoxyModelClass(layout = R.layout.card_account)
abstract class AccountModel : EpoxyModelWithHolder<AccountModel.Holder>() {

    @EpoxyAttribute
    var name: String? = null

    @EpoxyAttribute
    var organization: String? = null

    @EpoxyAttribute
    var province: String? = null

    @EpoxyAttribute
    var unqiueId: String? = null

    override fun bind(holder: Holder) {
        holder.nameTv.text = name
        holder.organizationTv.text = organization
        holder.provinceTv.text = province
        holder.uniqueIdTv.text = unqiueId
    }

    class Holder : EpoxyHolder() {

        lateinit var nameTv: TextView
        lateinit var organizationTv: TextView
        lateinit var provinceTv: TextView
        lateinit var uniqueIdTv: TextView

        override fun bindView(itemView: View) {
            nameTv = itemView.findViewById(R.id.nameTv)
            organizationTv = itemView.findViewById(R.id.organizationTv)
            provinceTv = itemView.findViewById(R.id.provinceTv)
            uniqueIdTv = itemView.findViewById(R.id.uniqueIdTv)
        }
    }


}
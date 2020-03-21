package de.lars.mathuseck.docconnect.ui.models

import android.view.View
import android.widget.TextView
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.google.android.material.card.MaterialCardView
import de.lars.mathuseck.docconnect.R


@EpoxyModelClass(layout = R.layout.card_question)
abstract class QuestionModel : EpoxyModelWithHolder<QuestionModel.Holder>() {

    @EpoxyAttribute
    var title: String? = null

    @EpoxyAttribute
    var description: String? = null

    override fun bind(holder: Holder) {
        holder.titleTv.text = title
        holder.descTv.text = description

        holder.questionCv.setOnClickListener {

        }
    }

    class Holder : EpoxyHolder() {

        lateinit var questionCv: MaterialCardView
        lateinit var titleTv: TextView
        lateinit var descTv: TextView

        override fun bindView(itemView: View) {
            questionCv = itemView.findViewById(R.id.questionCv)
            titleTv = itemView.findViewById(R.id.questionTitleTv)
            descTv = itemView.findViewById(R.id.questionDescTv)
        }
    }


}
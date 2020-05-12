package de.iris.docconnect.ui.models

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.google.android.material.card.MaterialCardView
import de.iris.docconnect.R


@EpoxyModelClass(layout = R.layout.card_question_answered)
abstract class QuestionAnsweredModel : EpoxyModelWithHolder<QuestionAnsweredModel.Holder>() {

    @EpoxyAttribute
    var title: String? = null

    @EpoxyAttribute
    var description: String? = null

    @EpoxyAttribute
    var answeredQuestion: Boolean = false

    @EpoxyAttribute
    var answer: String? = null

    @EpoxyAttribute
    var answerDate: String? = null

    @EpoxyAttribute
    var answerAuthor: String? = null

    @EpoxyAttribute
    var answerAuthorLogo: Int? = null

    override fun bind(holder: Holder) {
        val context = holder.titleTv.context

        holder.titleTv.text = title
        holder.descTv.text = description
        holder.authorTv.text = answerAuthor
        holder.dateTv.text = answerDate
        holder.answerTv.text = answer
        holder.authorIv.setImageResource(answerAuthorLogo ?: R.drawable.logo_rki)

    }

    class Holder : EpoxyHolder() {

        lateinit var questionCv: MaterialCardView
        lateinit var titleTv: TextView
        lateinit var descTv: TextView
        lateinit var authorTv: TextView
        lateinit var dateTv: TextView
        lateinit var answerTv: TextView
        lateinit var authorIv: ImageView

        override fun bindView(itemView: View) {
            questionCv = itemView.findViewById(R.id.questionCv)
            titleTv = itemView.findViewById(R.id.questionTitleTv)
            descTv = itemView.findViewById(R.id.questionDescTv)
            authorTv = itemView.findViewById(R.id.questionAuthorTv)
            authorIv = itemView.findViewById(R.id.questionIv)
            dateTv = itemView.findViewById(R.id.questionDateTv)
            answerTv = itemView.findViewById(R.id.questionAnswerTv)
        }
    }


}
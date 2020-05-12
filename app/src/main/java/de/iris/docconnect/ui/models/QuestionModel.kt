package de.iris.docconnect.ui.models

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.airbnb.lottie.LottieAnimationView
import com.google.android.material.button.MaterialButton
import com.google.android.material.card.MaterialCardView
import de.iris.docconnect.R


@EpoxyModelClass(layout = R.layout.card_question)
abstract class QuestionModel : EpoxyModelWithHolder<QuestionModel.Holder>() {

    @EpoxyAttribute
    var title: String? = null

    @EpoxyAttribute
    var description: String? = null

    @EpoxyAttribute
    var answeredQuestion: Boolean = false

    @EpoxyAttribute
    var amountOfUpvotes: Int = 0

    private var playedAnimation = false
    private var localUpvotes = 0

    override fun bind(holder: Holder) {
        val context = holder.titleTv.context
        if (localUpvotes == 0) {
            localUpvotes = amountOfUpvotes
        }

        holder.titleTv.text = title
        holder.descTv.text = description

        if (answeredQuestion) {
            holder.showButton.visibility = View.VISIBLE
            holder.showButton.setOnClickListener {

            }
        } else {
            holder.showButton.visibility = View.GONE
        }

        if (playedAnimation) {
            holder.heartIv.visibility = View.GONE
            holder.heartAv.progress = 1F
            holder.upvotesTv.setTextColor(
                ContextCompat.getColor(context, R.color.heartColor)
            )
            holder.upvotesTv.text = "$localUpvotes"
        } else {
            holder.upvotesTv.text = "$localUpvotes"
            holder.heartIv.visibility = View.VISIBLE
            holder.heartAv.progress = 0F
            holder.upvotesTv.setTextColor(ContextCompat.getColor(context, R.color.grey))
            holder.heartIv.setOnClickListener {
                holder.heartIv.visibility = View.GONE
                holder.heartAv.playAnimation()
                localUpvotes++
                holder.upvotesTv.setTextColor(
                    ContextCompat.getColor(context, R.color.heartColor)
                )
                holder.upvotesTv.text = "$localUpvotes"
                playedAnimation = true
            }
        }

    }

    class Holder : EpoxyHolder() {

        lateinit var questionCv: MaterialCardView
        lateinit var titleTv: TextView
        lateinit var descTv: TextView
        lateinit var heartAv: LottieAnimationView
        lateinit var heartIv: ImageView
        lateinit var upvotesTv: TextView
        lateinit var showButton: MaterialButton

        override fun bindView(itemView: View) {
            questionCv = itemView.findViewById(R.id.questionCv)
            titleTv = itemView.findViewById(R.id.questionTitleTv)
            descTv = itemView.findViewById(R.id.questionDescTv)
            heartAv = itemView.findViewById(R.id.questionAv)
            heartIv = itemView.findViewById(R.id.questionHeartIv)
            upvotesTv = itemView.findViewById(R.id.questionUpvotesTv)
            showButton = itemView.findViewById(R.id.questionButton)
        }
    }


}
package de.iris.docconnect.ui.news

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.firestore.ktx.toObject
import com.google.firebase.ktx.Firebase
import de.iris.docconnect.MainActivity
import de.iris.docconnect.R
import de.iris.docconnect.models.Message
import de.iris.docconnect.ui.info.details.InfoDetailsActivity
import de.iris.docconnect.ui.info.details.KEY_INFORMATION_ID
import de.iris.docconnect.ui.models.information
import de.iris.docconnect.ui.models.loading
import de.iris.docconnect.ui.models.title
import kotlinx.android.synthetic.main.fragment_news.*
import timber.log.Timber

class NewsFragment : Fragment(),
    MainActivity.OnFragmentReselectedListener {

    companion object {
        fun newInstance() = NewsFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_news, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val db = Firebase.firestore
        db.collection("messages")
            .whereArrayContains("roles", "pilot:konstanz")
            .get()
            .addOnSuccessListener { result ->
                val messages = mutableListOf<Message>()
                result.documents.forEach {
                    val message = it.toObject<Message>()
                    message?.let { guardedMessage ->
                        guardedMessage.id = it.id
                        messages.add(guardedMessage)
                    }
                }
                buildModels(messages)
            }
            .addOnFailureListener { exception ->
                Timber.e(exception, "Error getting documents.")
            }

        buildModels(listOf(), true)
    }

    override fun fragmentReselected() {

    }

    private fun buildModels(messages: List<Message>, showLoading: Boolean = false) {
        newsRv.withModels {

            title {
                id("information_title")
                title(getString(R.string.info))
            }

            if (showLoading) {
                loading {
                    id("loading_item")
                }
            }

            messages.forEachIndexed { index, message ->

                information {
                    id("info_$index")
                    informationId(message.id)
                    title(message.title)
                    summary(message.summary)
                    date(message.createdAt)
                    author(message.authorName)
                    callback { informationId ->
                        context?.let { context ->
                            val intent = Intent(context, InfoDetailsActivity::class.java).apply {
                                putExtra(KEY_INFORMATION_ID, informationId)
                            }
                            startActivity(intent)
                        }
                    }
                }
            }
        }
    }
}
package de.iris.docconnect.ui.info.details

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.firestore.ktx.toObject
import com.google.firebase.firestore.ktx.toObjects
import com.google.firebase.ktx.Firebase
import de.iris.docconnect.R
import de.iris.docconnect.models.Message
import io.noties.markwon.Markwon
import kotlinx.android.synthetic.main.activity_info_details.*
import timber.log.Timber

const val KEY_INFORMATION_ID = "INFORMATION_ID"

class InfoDetailsActivity : AppCompatActivity() {

    private var informationId: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_details)

        setSupportActionBar(infoDetailsToolbar)
        infoDetailsToolbar.setNavigationOnClickListener {
            onBackPressed()
        }

        informationId = intent.extras?.getString(KEY_INFORMATION_ID)
        if (informationId == null) {
            informationId = savedInstanceState?.getString(KEY_INFORMATION_ID)
        }

        val guardedInfoId = informationId ?: return

        Firebase.firestore.collection("messages").document(guardedInfoId)
            .get()
            .addOnSuccessListener { result ->
                val message = result.toObject<Message>()

                val markwon = Markwon.create(this)
                markwon.setMarkdown(infoDetailsTv, message?.text ?: "")
            }
            .addOnFailureListener { exception ->
                Timber.e(exception,"Error getting document with id: $guardedInfoId.")
            }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putString(KEY_INFORMATION_ID, informationId)

        super.onSaveInstanceState(outState)
    }
}

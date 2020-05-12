package de.iris.docconnect.ui.questions

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import de.iris.docconnect.Model
import de.iris.docconnect.R
import de.iris.docconnect.models.Question
import kotlinx.android.synthetic.main.activity_add_question.*

class AddQuestionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_question)

        setSupportActionBar(addQuestionToolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Frage stellen"
        addQuestionToolbar.setNavigationOnClickListener {
            this.finish()
        }


        addQuestionButton.setOnClickListener {
            Model.questions.add(
                0,
                Question(
                    "Question${Model.questions.size}",
                    addQuestionTitleEt.text.toString(),
                    addQuestionDescEt.text.toString(),
                    0
                )
            )
            finish()
        }
    }

}

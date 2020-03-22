package de.lars.mathuseck.docconnect.ui.questions

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import de.lars.mathuseck.docconnect.Model
import de.lars.mathuseck.docconnect.R
import de.lars.mathuseck.docconnect.models.Question
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

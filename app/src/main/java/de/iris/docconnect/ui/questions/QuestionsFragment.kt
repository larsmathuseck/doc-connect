package de.iris.docconnect.ui.questions

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import de.iris.docconnect.Model
import de.iris.docconnect.R
import de.iris.docconnect.ui.models.DropdownModel
import de.iris.docconnect.ui.models.dropdown
import de.iris.docconnect.ui.models.question
import de.iris.docconnect.ui.models.questionAnswered
import kotlinx.android.synthetic.main.fragment_questions.*

class QuestionsFragment : Fragment(), DropdownModel.OnInteractionListener,
    SortDialog.OnInteractionListener {

    companion object {
        fun newInstance(showAnsweredQuestions: Boolean) = QuestionsFragment().apply {
            this.showAnsweredQuestions = showAnsweredQuestions
        }
    }

    private var showAnsweredQuestions = false
    private var sorting = Sorting.NEWEST

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_questions, container, false)
    }

    override fun onResume() {
        super.onResume()

        buildModels()
    }

    override fun onDropdownSelected() {
        SortDialog(this, sorting).show(parentFragmentManager, "tag")
    }

    override fun sortingChanged(sorting: Sorting) {
        this.sorting = sorting
        buildModels()
    }

    private fun buildModels() {
        var questions = if (showAnsweredQuestions) {
            Model.answeredQuestions.toList()
        } else {
            Model.questions.toList()
        }

        if (sorting == Sorting.FAMOUS) {
            questions = questions.sortedByDescending { it.upvotes }
        }
        questionsRv.withModels {
            dropdown {
                id("sort_drop_down")
                displayText(sorting.displayText)
                callback(this@QuestionsFragment)
            }
            questions.forEach {
                if (showAnsweredQuestions) {
                    questionAnswered {
                        id("question_item_${it.id}")
                        title(it.title)
                        description(it.description)
                        answerAuthor(it.answerAuthor)
                        answerAuthorLogo(it.answerAuthorLogo)
                        answerDate(it.answerDate)
                        answer(it.answer)
                    }
                } else {
                    question {
                        id("question_item_${it.id}")
                        title(it.title)
                        description(it.description)
                        amountOfUpvotes(it.upvotes)
                        answeredQuestion(showAnsweredQuestions)
                    }
                }
            }
        }
    }
}
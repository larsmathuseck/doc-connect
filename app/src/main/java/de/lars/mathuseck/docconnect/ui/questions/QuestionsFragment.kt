package de.lars.mathuseck.docconnect.ui.questions

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import de.lars.mathuseck.docconnect.Model
import de.lars.mathuseck.docconnect.R
import de.lars.mathuseck.docconnect.ui.models.DropdownModel
import de.lars.mathuseck.docconnect.ui.models.dropdown
import de.lars.mathuseck.docconnect.ui.models.question
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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

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
        var questions = Model.questions
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
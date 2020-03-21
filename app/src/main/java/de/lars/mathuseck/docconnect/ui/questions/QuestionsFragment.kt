package de.lars.mathuseck.docconnect.ui.questions

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import de.lars.mathuseck.docconnect.MainActivity
import de.lars.mathuseck.docconnect.R
import de.lars.mathuseck.docconnect.ui.models.DropdownModel
import de.lars.mathuseck.docconnect.ui.models.dropdown
import de.lars.mathuseck.docconnect.ui.models.question
import de.lars.mathuseck.docconnect.ui.models.title
import kotlinx.android.synthetic.main.fragment_questions.*

class QuestionsFragment : Fragment(),DropdownModel.OnInteractionListener, SortDialog.OnInteractionListener {

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

        if(showAnsweredQuestions) {
            questionsRv.withModels {
                dropdown {
                    id("sort_drop_down")
                    displayText(sorting.displayText)
                    callback(this@QuestionsFragment)
                }
                for (i in 0..10) {
                    question {
                        id("question_item_$i")
                        title("Hilft Ibuprofen gegen SARS-CoV-2?")
                        description("Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et d")
                    }
                }
            }
        } else {
            questionsRv.withModels {
                title {
                    id("terst")
                    title("unanswered")
                }
            }
        }
    }
}
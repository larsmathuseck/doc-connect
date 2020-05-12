package de.iris.docconnect.ui.questions

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayoutMediator
import com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
import de.iris.docconnect.MainActivity
import de.iris.docconnect.R
import kotlinx.android.synthetic.main.fragment_main_questions.*


class MainQuestionsFragment : Fragment(),
    MainActivity.OnFragmentReselectedListener {

    companion object {
        fun newInstance() = MainQuestionsFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main_questions, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        questionsViewPager.adapter = QuestionsViewPagerAdapter(requireActivity())
        TabLayoutMediator(questionTabLayout, questionsViewPager,
            TabConfigurationStrategy { tab, position ->
                tab.text = when (position) {
                    QuestionPages.ANSWERED_QUESTIONS.position -> "Beantwortet"
                    QuestionPages.UNANSWERED_QUESTIONS.position -> "Offen"
                    else -> "Offen"
                }
            }).attach()

        questionFab.setOnClickListener {
            val intent = Intent(requireContext(), AddQuestionActivity::class.java)
            startActivity(intent)
        }

    }

    override fun fragmentReselected() {

    }
}
package de.lars.mathuseck.docconnect.ui.questions

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

enum class QuestionPages(val position: Int) {
    UNANSWERED_QUESTIONS(0), ANSWERED_QUESTIONS(1)
}

class QuestionsViewPagerAdapter(fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            QuestionPages.UNANSWERED_QUESTIONS.position -> QuestionsFragment.newInstance(false)
            QuestionPages.ANSWERED_QUESTIONS.position -> QuestionsFragment.newInstance(true)
            else -> QuestionsFragment.newInstance(false)
        }
    }

    override fun getItemCount(): Int {
        return QuestionPages.values().size
    }
}
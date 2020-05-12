package de.iris.docconnect

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import de.iris.docconnect.ui.account.AccountFragment
import de.iris.docconnect.ui.info.InformationFragment
import de.iris.docconnect.ui.news.NewsFragment
import de.iris.docconnect.ui.questions.MainQuestionsFragment
import de.iris.docconnect.utils.FragmentStateManager
import kotlinx.android.synthetic.main.activity_main.*

private const val POSITION_INFO = 0
private const val POSITION_QUESTIONS = 1
private const val POSITION_NEWS = 2
private const val POSITION_ACCOUNT = 3

class MainActivity : AppCompatActivity() {

    private lateinit var infoFragment: InformationFragment
    private lateinit var questionFragment: MainQuestionsFragment
    private lateinit var newsFragment: NewsFragment
    private lateinit var accountFragment: AccountFragment

    private val navigationSelectedListener =
        BottomNavigationView.OnNavigationItemSelectedListener { item ->
            fragmentStateManager.changeFragment(getNavPositionFromMenuItem(item.itemId))
            true
        }

    private val navigationReselectedListener =
        BottomNavigationView.OnNavigationItemReselectedListener { item ->
            when (getNavPositionFromMenuItem(item.itemId)) {
                POSITION_INFO -> infoFragment.fragmentReselected()
                POSITION_QUESTIONS -> questionFragment.fragmentReselected()
                POSITION_NEWS -> newsFragment.fragmentReselected()
                POSITION_ACCOUNT -> accountFragment.fragmentReselected()
                else -> infoFragment.fragmentReselected()
            }
        }

    private fun getNavPositionFromMenuItem(itemId: Int) = when (itemId) {
        R.id.navigation_info -> POSITION_INFO
        R.id.navigation_questions -> POSITION_QUESTIONS
        R.id.navigation_news -> POSITION_NEWS
        R.id.navigation_account -> POSITION_ACCOUNT
        else -> POSITION_INFO
    }

    private lateinit var fragmentStateManager: FragmentStateManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fragmentStateManager = object : FragmentStateManager(mainContent, supportFragmentManager) {
            override fun getItem(position: Int): Fragment {
                return when (position) {
                    POSITION_INFO -> {
                        infoFragment = InformationFragment.newInstance()
                        infoFragment
                    }
                    POSITION_QUESTIONS -> {
                        questionFragment = MainQuestionsFragment.newInstance()
                        questionFragment
                    }
                    POSITION_NEWS -> {
                        newsFragment = NewsFragment.newInstance()
                        newsFragment
                    }
                    POSITION_ACCOUNT -> {
                        accountFragment = AccountFragment.newInstance()
                        accountFragment
                    }
                    else -> {
                        infoFragment = InformationFragment.newInstance()
                        infoFragment
                    }
                }
            }
        }

        infoFragment = InformationFragment.newInstance()
        questionFragment = MainQuestionsFragment.newInstance()
        newsFragment = NewsFragment.newInstance()
        accountFragment = AccountFragment.newInstance()

        navigation.setOnNavigationItemSelectedListener(navigationSelectedListener)
        navigation.setOnNavigationItemReselectedListener(navigationReselectedListener)

        // If we're being restored from a previous state,
        // then we don't need to do anything or
        // we could end up with overlapping fragments.
        if (savedInstanceState == null) {
            fragmentStateManager.changeFragment(POSITION_NEWS)
            navigation.selectedItemId = R.id.navigation_news
        }
    }


    /**
     * Pressing the back button should navigate the user back to the first navigation bar tab.
     */
    override fun onBackPressed() {
        val position = getNavPositionFromMenuItem(navigation.selectedItemId)
        if (position != POSITION_NEWS) {
            navigation.selectedItemId = R.id.navigation_news
        } else {
            // close app
            finishAffinity()
        }
    }


    interface OnFragmentReselectedListener {

        /**
         * callback function, gets called when the fragment got reselected
         */
        fun fragmentReselected()
    }
}

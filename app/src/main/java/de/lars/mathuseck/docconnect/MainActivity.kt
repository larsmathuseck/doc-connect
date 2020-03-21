package de.lars.mathuseck.docconnect

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import de.lars.mathuseck.docconnect.ui.info.InformationFragment
import de.lars.mathuseck.docconnect.ui.news.NewsFragment
import de.lars.mathuseck.docconnect.ui.questions.QuestionsFragment
import de.lars.mathuseck.docconnect.utils.FragmentStateManager
import kotlinx.android.synthetic.main.activity_main.*

private const val POSITION_INFO = 0
private const val POSITION_QUESTIONS = 1
private const val POSITION_NEWS = 2

class MainActivity : AppCompatActivity() {

    private lateinit var infoFragment: InformationFragment
    private lateinit var questionFragment: QuestionsFragment
    private lateinit var newsFragment: NewsFragment

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
                else -> infoFragment.fragmentReselected()
            }
        }

    private fun getNavPositionFromMenuItem(itemId: Int) = when (itemId) {
        R.id.navigation_info -> POSITION_INFO
        R.id.navigation_questions -> POSITION_QUESTIONS
        R.id.navigation_news -> POSITION_NEWS
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
                        questionFragment = QuestionsFragment.newInstance()
                        questionFragment
                    }
                    POSITION_NEWS -> {
                        newsFragment = NewsFragment.newInstance()
                        newsFragment
                    }
                    else -> {
                        infoFragment = InformationFragment.newInstance()
                        infoFragment
                    }
                }
            }
        }

        infoFragment = InformationFragment.newInstance()
        questionFragment = QuestionsFragment.newInstance()
        newsFragment = NewsFragment.newInstance()

        navigation.setOnNavigationItemSelectedListener(navigationSelectedListener)
        navigation.setOnNavigationItemReselectedListener(navigationReselectedListener)

        // If we're being restored from a previous state,
        // then we don't need to do anything or
        // we could end up with overlapping fragments.
        if (savedInstanceState == null) {
            fragmentStateManager.changeFragment(POSITION_INFO)
            navigation.selectedItemId = R.id.navigation_info
        }
    }


    /**
     * Pressing the back button should navigate the user back to the first navigation bar tab.
     */
    override fun onBackPressed() {
        val position = getNavPositionFromMenuItem(navigation.selectedItemId)
        if (position != POSITION_INFO) {
            navigation.selectedItemId = R.id.navigation_info
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

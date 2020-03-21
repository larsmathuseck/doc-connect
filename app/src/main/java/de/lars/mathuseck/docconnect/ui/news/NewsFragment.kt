package de.lars.mathuseck.docconnect.ui.news

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import de.lars.mathuseck.docconnect.MainActivity
import de.lars.mathuseck.docconnect.R
import de.lars.mathuseck.docconnect.ui.models.news
import de.lars.mathuseck.docconnect.ui.models.title
import kotlinx.android.synthetic.main.fragment_news.*

class NewsFragment : Fragment(),
    MainActivity.OnFragmentReselectedListener {

    companion object {
        fun newInstance() = NewsFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_news, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buildModels()
    }

    override fun fragmentReselected() {

    }

    private fun buildModels() {
        newsRv.withModels {
            title {
                id("updates_title")
                title("Updates")
            }

            for (i in 0..10) {
                news {
                    id("news_car_$i")
                    author("Robert Koch Institut")
                    date("21.03.2020, 12:31 Uhr")
                    title("Risikobewertung für Deutschland ist jetzt hoch")
                    description("Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum ")
                }
            }
        }
    }
}
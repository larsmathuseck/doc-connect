package de.lars.mathuseck.docconnect.ui.news

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import de.lars.mathuseck.docconnect.MainActivity
import de.lars.mathuseck.docconnect.Model
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
                title("Neuigkeiten")
            }

            Model.news.forEach {
                news {
                    id("news_car_${it.id}")
                    author(it.issuer)
                    date(it.date)
                    title(it.title)
                    description(it.description)
                    issuerLogo(it.icon)
                }
            }
        }
    }
}
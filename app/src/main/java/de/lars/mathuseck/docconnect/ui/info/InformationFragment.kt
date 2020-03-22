package de.lars.mathuseck.docconnect.ui.info

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import de.lars.mathuseck.docconnect.MainActivity
import de.lars.mathuseck.docconnect.R
import de.lars.mathuseck.docconnect.ui.models.information
import de.lars.mathuseck.docconnect.ui.models.search
import de.lars.mathuseck.docconnect.ui.models.title
import kotlinx.android.synthetic.main.fragment_info.*

class InformationFragment : Fragment(),
    MainActivity.OnFragmentReselectedListener {

    companion object {
        fun newInstance() = InformationFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_info, container, false)
    }

    override fun fragmentReselected() {

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buildModels()
    }


    private fun buildModels() {
        infoRv.withModels {

            title {
                id("information_title")
                title(getString(R.string.info))
            }

            search {
                id("search")
            }

            information {
                id("info_1")
                title(getString(R.string.info_dummy_1_title))
                text(getString(R.string.info_dummy_1_text))
            }

            information {
                id("info_2")
                title(getString(R.string.info_dummy_2_title))
                text(getString(R.string.info_dummy_2_text))
            }


            information {
                id("info_3")
                title(getString(R.string.info_dummy_3_title))
                text(getString(R.string.info_dummy_3_text))

            }

            information {
                id("info_4")
                title(getString(R.string.info_dummy_4_title))
                text(getString(R.string.info_dummy_4_text))
            }


            information {
                id("info_5")
                title(getString(R.string.info_dummy_5_title))
                text(getString(R.string.info_dummy_5_text))
            }

            information {
                id("info_6")
                title(getString(R.string.info_dummy_6_title))
                text(getString(R.string.info_dummy_6_text))
            }

            information {
                id("info_7")
                title(getString(R.string.info_dummy_7_title))
                text(getString(R.string.info_dummy_7_text))
            }

        }
    }

}
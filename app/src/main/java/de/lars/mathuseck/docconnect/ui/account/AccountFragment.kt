package de.lars.mathuseck.docconnect.ui.account

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import de.lars.mathuseck.docconnect.MainActivity
import de.lars.mathuseck.docconnect.R
import de.lars.mathuseck.docconnect.ui.models.account
import de.lars.mathuseck.docconnect.ui.models.news
import de.lars.mathuseck.docconnect.ui.models.title
import kotlinx.android.synthetic.main.card_account.*
import kotlinx.android.synthetic.main.fragment_account.*
import kotlinx.android.synthetic.main.fragment_news.*

class AccountFragment : Fragment(),
    MainActivity.OnFragmentReselectedListener {

    companion object {
        fun newInstance() = AccountFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_account, container, false)
    }

    override fun fragmentReselected() {

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buildModels()
    }


    private fun buildModels() {
        accountRv.withModels {
            title {
                id("account_title")
                title(getString(R.string.account))
            }

            account {
                id("account_card")
                organization(getString(R.string.dummy_organization))
                name(getString(R.string.dummy_name))
                province(getString(R.string.dummy_province))
                unqiueId(getString(R.string.dummy_unique_id))
            }
        }
    }
}
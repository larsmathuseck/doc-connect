package de.iris.docconnect.ui.account

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import de.iris.docconnect.MainActivity
import de.iris.docconnect.OnboardingActivity
import de.iris.docconnect.R
import de.iris.docconnect.ui.models.AccountModel
import de.iris.docconnect.ui.models.account
import de.iris.docconnect.ui.models.credits
import de.iris.docconnect.ui.models.title
import de.iris.docconnect.utils.SharedPreferencesHelper
import kotlinx.android.synthetic.main.fragment_account.*
import org.jetbrains.annotations.Nullable

class AccountFragment : Fragment(),
    MainActivity.OnFragmentReselectedListener, @Nullable AccountModel.OnInteractionListener {

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
                onInteractionListener(this@AccountFragment)
            }

            title {
                id("credits_title")
                title("App Info")
            }

            credits {
                id("credits")
            }
        }
    }

    override fun onLogoutClicked() {
        val sharedPrefs = SharedPreferencesHelper(requireContext())
        sharedPrefs.setUserToken("")
        val intent = Intent(requireContext(), OnboardingActivity::class.java)
        startActivity(intent)
        activity?.finish()
    }
}
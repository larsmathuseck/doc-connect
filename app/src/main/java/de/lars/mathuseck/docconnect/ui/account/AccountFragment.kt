package de.lars.mathuseck.docconnect.ui.account

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import de.lars.mathuseck.docconnect.MainActivity
import de.lars.mathuseck.docconnect.OnboardingActivity
import de.lars.mathuseck.docconnect.R
import de.lars.mathuseck.docconnect.ui.models.AccountModel
import de.lars.mathuseck.docconnect.ui.models.account
import de.lars.mathuseck.docconnect.ui.models.title
import de.lars.mathuseck.docconnect.utils.SharedPreferencesHelper
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
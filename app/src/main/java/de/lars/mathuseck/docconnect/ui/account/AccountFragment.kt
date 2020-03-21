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
import de.lars.mathuseck.docconnect.utils.SharedPreferencesHelper
import kotlinx.android.synthetic.main.fragment_account.*

class AccountFragment : Fragment(), MainActivity.OnFragmentReselectedListener {

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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        accountLogoutButton.setOnClickListener {
            val sharedPrefs = SharedPreferencesHelper(requireContext())
            sharedPrefs.setUserToken("")
            val intent = Intent(requireContext(), OnboardingActivity::class.java)
            startActivity(intent)
            activity?.finish()
        }
    }

    override fun fragmentReselected() {

    }
}
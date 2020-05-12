package de.iris.docconnect.ui.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import de.iris.docconnect.R
import de.iris.docconnect.utils.SharedPreferencesHelper
import kotlinx.android.synthetic.main.onboarding_skill_fragment.*

class OnboardingSkill : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.onboarding_skill_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        startButton.setOnClickListener {
            SharedPreferencesHelper(requireContext()).setUserToken("Test")
            view.findNavController()
                .navigate(R.id.action_onboardingSkill_to_mainActivity)
        }
    }
}

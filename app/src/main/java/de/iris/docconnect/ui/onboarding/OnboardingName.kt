package de.iris.docconnect.ui.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import de.iris.docconnect.R
import kotlinx.android.synthetic.main.onboarding_name_fragment.*

class OnboardingName : Fragment() {

    companion object {
        fun newInstance() = OnboardingName()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.onboarding_name_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        nameButton.setOnClickListener {
            view.findNavController()
                .navigate(R.id.action_onboardingName_to_onboardingLoadingFragment2)
        }
    }
}

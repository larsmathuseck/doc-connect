package de.iris.docconnect.ui.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import de.iris.docconnect.R
import kotlinx.android.synthetic.main.onboarding_start_fragment.*

class OnboardingStart : Fragment() {

    companion object {
        fun newInstance() = OnboardingStart()
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.onboarding_start_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        startButton.setOnClickListener {
            view.findNavController()
                .navigate(R.id.action_onboardingStart_to_onboardingName)
        }
    }

}

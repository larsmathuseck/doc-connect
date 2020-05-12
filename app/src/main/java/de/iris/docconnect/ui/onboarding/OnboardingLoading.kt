package de.iris.docconnect.ui.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController

import de.iris.docconnect.R
import de.iris.docconnect.utils.Event

class OnboardingLoading : Fragment() {

    companion object {
        fun newInstance() = OnboardingLoading()
    }

    private lateinit var viewModel: LoadingViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.onboarding_loading_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(LoadingViewModel::class.java)
        viewModel.timeLiveData.observe(viewLifecycleOwner, Event.observer {
            view.findNavController()
                .navigate(R.id.action_onboardingLoadingFragment2_to_onboardingSkill)
        })
        viewModel.startTimer(5300)
    }

}

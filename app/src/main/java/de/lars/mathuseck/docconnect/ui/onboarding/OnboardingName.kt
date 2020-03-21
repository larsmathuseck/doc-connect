package de.lars.mathuseck.docconnect.ui.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import de.lars.mathuseck.docconnect.R

class OnboardingName : Fragment() {

    companion object {
        fun newInstance() = OnboardingName()
    }

    private lateinit var viewModel: OnboardingNameViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.onboarding_name_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(OnboardingNameViewModel::class.java)
    }

}

package de.lars.mathuseck.docconnect.ui.onboarding

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import de.lars.mathuseck.docconnect.R

class OnboardingSkill : Fragment() {

    companion object {
        fun newInstance() = OnboardingSkill()
    }

    private lateinit var viewModel: OnboardingSkillViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.onboarding_skill_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(OnboardingSkillViewModel::class.java)
        // TODO: Use the ViewModel
    }

}

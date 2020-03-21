package de.lars.mathuseck.docconnect

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import de.lars.mathuseck.docconnect.ui.onboarding.OnboardingStart

class OnboardingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboarding_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, OnboardingStart.newInstance())
                .commitNow()
        }
    }
}

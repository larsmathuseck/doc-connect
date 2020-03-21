package de.lars.mathuseck.docconnect

import android.app.ActivityOptions
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class StartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val options = ActivityOptions.makeCustomAnimation(this, 0, 0)
        val intent = Intent(this, OnboardingActivity::class.java)

        startActivity(intent, options.toBundle())
    }
}

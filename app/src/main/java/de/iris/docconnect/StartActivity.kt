package de.iris.docconnect

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import de.iris.docconnect.utils.SharedPreferencesHelper

class StartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val sharedPrefs = SharedPreferencesHelper(this)
        val token = sharedPrefs.getUserToken()
        val intent = if (token.isNullOrEmpty()) {
            Intent(this, OnboardingActivity::class.java)
        } else {
            Intent(this, MainActivity::class.java)
        }

        val options = ActivityOptions.makeCustomAnimation(this, 0, 0)
        startActivity(intent, options.toBundle())
    }
}

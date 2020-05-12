package de.iris.docconnect.utils

import android.content.Context
import android.content.SharedPreferences

private const val SHARED_PREFS_ID = "DOC_CONNECT_SHARED_PREFS"
private const val KEY_USER_TOKEN = "USER_TOKEN"

class SharedPreferencesHelper(context: Context) {

    private val sharedPrefs: SharedPreferences =
        context.getSharedPreferences(SHARED_PREFS_ID, Context.MODE_PRIVATE)

    fun setUserToken(token: String) {
        sharedPrefs.edit().putString(KEY_USER_TOKEN, token).apply()
    }

    fun getUserToken() = sharedPrefs.getString(KEY_USER_TOKEN, "")

}
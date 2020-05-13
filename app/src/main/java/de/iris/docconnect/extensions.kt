package de.iris.docconnect

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

fun Fragment.getAppCompatActivity() = activity as? AppCompatActivity
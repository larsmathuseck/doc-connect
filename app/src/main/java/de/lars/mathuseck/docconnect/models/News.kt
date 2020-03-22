package de.lars.mathuseck.docconnect.models

import androidx.annotation.DrawableRes

data class News(
    val id: String,
    val issuer: String,
    val date: String,
    val title: String,
    val description: String,
    @DrawableRes val icon: Int
)
package de.lars.mathuseck.docconnect.models

import de.lars.mathuseck.docconnect.R

data class Question(
    val id: String,
    val title: String,
    val description: String,
    val upvotes: Int,
    val answer: String = "",
    val answerDate: String = "",
    val answerAuthor: String = "",
    val answerAuthorLogo: Int = R.drawable.logo_rki
)
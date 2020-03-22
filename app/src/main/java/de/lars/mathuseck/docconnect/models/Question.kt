package de.lars.mathuseck.docconnect.models

data class Question(
    val id: String,
    val title: String,
    val description: String,
    val upvotes: Int,
    val answer: String = ""
)
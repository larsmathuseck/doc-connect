package de.iris.docconnect.models

import java.util.*

data class Message(
    var id: String? = null,
    val author: String? = null,
    val authorName: String? = null,
    val createdAt: Date? = null,
    val down: Int? = null,
    val up: Int? = null,
    val isDeleted: Boolean? = null,
    val isPublished: Boolean? = null,
    val roles: List<String>? = null,
    val text: String? = null,
    val summary: String? = null,
    val title: String? = null
)
package de.iris.docconnect.utils

import java.text.SimpleDateFormat
import java.util.*

private const val dateFormat = "dd.MM.yyyy, HH:mm"

/**
 * Produce a displayable string for the given date
 */
fun getPrintableTimestamp(date: Date?): String {
    if (date == null) return ""

    return SimpleDateFormat(dateFormat, Locale.getDefault()).format(date)

}
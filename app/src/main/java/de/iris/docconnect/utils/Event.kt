package de.iris.docconnect.utils

import androidx.lifecycle.Observer

open class Event<out T>(private val content: T) {

    var hasBeenHandled = false
        private set // Allow external read but not write

    /**
     * Returns the content and prevents its use again.
     */
    private fun getContentIfNotHandled(): T? {
        return if (hasBeenHandled) {
            null
        } else {
            hasBeenHandled = true
            content
        }
    }

    companion object {
        fun <T> observer(
            unpacker: (T) -> Unit
        ): Observer<Event<T>> {
            return Observer {
                it.getContentIfNotHandled()?.let(unpacker)
            }
        }

        fun <T> recallObserver(
            unpacker: (T) -> Unit
        ): Observer<Event<T>> {
            return Observer {
                unpacker.invoke(it.content)
            }
        }
    }
}
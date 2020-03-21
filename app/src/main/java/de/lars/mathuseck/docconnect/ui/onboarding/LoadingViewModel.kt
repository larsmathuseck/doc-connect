package de.lars.mathuseck.docconnect.ui.onboarding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import de.lars.mathuseck.docconnect.utils.Event

class LoadingViewModel : ViewModel() {

    val timeLiveData = MutableLiveData<Event<Boolean>>()

    fun startTimer(duration: Long) {
        viewModelScope.launch {
            delay(duration)
            timeLiveData.postValue(Event(true))
        }
    }
}

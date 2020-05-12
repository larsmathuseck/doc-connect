package de.iris.docconnect.ui.questions

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import de.iris.docconnect.R
import kotlinx.android.synthetic.main.dialog_sort.*

enum class Sorting(val displayText: String) {
    NEWEST("Neueste"), TREND("Trend"), FAMOUS("Beliebt")
}

class SortDialog(val callback: OnInteractionListener, val currentSorting: Sorting) : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.dialog_sort, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        when(currentSorting){
            Sorting.NEWEST -> sortNewestButton.isChecked = true
            Sorting.TREND -> sortTrendButton.isChecked = true
            Sorting.FAMOUS -> sortFamousButton.isChecked = true
        }

        sortNewestContainer.setOnClickListener {
            callback.sortingChanged(Sorting.NEWEST)
            this.dismiss()
        }
        sortFamousContainer.setOnClickListener {
            callback.sortingChanged(Sorting.FAMOUS)
            this.dismiss()
        }
        sortTrendContainer.setOnClickListener {
            callback.sortingChanged(Sorting.TREND)
            this.dismiss()
        }
    }

    interface OnInteractionListener {
        fun sortingChanged(sorting: Sorting)
    }

}
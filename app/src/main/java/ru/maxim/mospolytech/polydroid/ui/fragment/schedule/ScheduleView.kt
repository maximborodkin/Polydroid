package ru.maxim.mospolytech.polydroid.ui.fragment.schedule

import com.arellomobile.mvp.MvpView
import ru.maxim.mospolytech.polydroid.model.Schedule
import ru.maxim.mospolytech.polydroid.model.ScheduleType
import ru.maxim.mospolytech.polydroid.model.SearchObject

interface ScheduleView : MvpView {

    fun onScheduleLoaded(type: ScheduleType, schedule: Schedule)
    fun onSearchObjectsLoaded(searchObjects: List<SearchObject>)
    fun onScheduleLoadError()
    fun showLoading()
}

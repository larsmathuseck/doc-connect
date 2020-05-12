package de.iris.docconnect

import android.app.Application
import timber.log.Timber

class DocConnectApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        Timber.plant(object : Timber.Tree() {
            override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
                println(message)
            }

        })
    }

}
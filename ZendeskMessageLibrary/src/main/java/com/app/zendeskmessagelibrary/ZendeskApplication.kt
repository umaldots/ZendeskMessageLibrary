package com.app.zendeskmessagelibrary

import android.app.Application
import android.util.Log
import zendesk.android.Zendesk
import zendesk.messaging.android.DefaultMessagingFactory

class ZendeskApplication : Application() {

    private val ZENDESK_KEY = "eyJzZXR0aW5nc191cmwiOiJodHRwczovL3JpZ2h0aGFuZHNzdXBwb3J0LnplbmRlc2suY29tL21vYmlsZV9zZGtfYXBpL3NldHRpbmdzLzAxSFFXU1ZKNUNIODBXVFlGRTIyN0dHWUVKLmpzb24ifQ=="

    override fun onCreate() {
        super.onCreate()
        Zendesk.initialize(
            context = this,
            channelKey = ZENDESK_KEY,
            successCallback = {
                Log.i("IntegrationApplication", "Initialization successful")
            },
            failureCallback = { error ->
                // Tracking the cause of exceptions in your crash reporting dashboard will help to triage any unexpected failures in production
                Log.e("IntegrationApplication", "Initialization failed", error)
            },
            messagingFactory = DefaultMessagingFactory()
        )
    }
}
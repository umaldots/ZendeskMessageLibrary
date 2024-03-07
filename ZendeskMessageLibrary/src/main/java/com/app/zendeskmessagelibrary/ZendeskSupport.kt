package com.app.zendeskmessagelibrary

import android.content.Context
import zendesk.android.Zendesk

class ZendeskSupport {
    companion object{
        fun openMessagingPage(context: Context){
            Zendesk.instance.messaging.showMessaging(context)
        }
    }
}
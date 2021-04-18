package com.decimalab.dagger2.data.netwotk

import android.content.Context

class NetworkService(
    context: Context,
    url: String,
    apiKey: String
) {

    private var mApiKey: String = ""
    private var mUrl: String = ""
    private var mContext: Context? = null


    init {
        mContext = context
        mApiKey = apiKey
        mUrl = url
    }

    fun getNetworkService(): String {
        return " $mUrl - $mApiKey"
    }
}
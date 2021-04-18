package com.decimalab.dagger2.data.netwotk

import android.content.Context

class NetworkService(private val context: Context) {

    private var apiKey: String =  ""
    private var mUrl: String =  ""
    private var mContext: Context?  = null


    init {
        mContext = context
        apiKey = "151554545"
        mUrl = "http://test.com"
    }

    fun getNetworkService(): String{
        return " $mUrl - $apiKey"
    }
}
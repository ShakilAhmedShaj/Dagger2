package com.decimalab.dagger2.data.netwotk

import android.content.Context
import com.decimalab.dagger2.di.qualifier.ApiKEey
import com.decimalab.dagger2.di.qualifier.Url
import javax.inject.Inject

class NetworkService @Inject constructor(
    context: Context,
    @Url url: String,
    @ApiKEey apiKey: String
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
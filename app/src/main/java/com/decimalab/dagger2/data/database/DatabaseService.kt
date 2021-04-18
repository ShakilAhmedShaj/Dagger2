package com.decimalab.dagger2.data.database

import android.content.Context


class DatabaseService(private val context: Context) {

    private var databaseName: String =  ""
    private var databaseVersion: Int = 0
    private var mContext: Context?  = null

    init {
        mContext = context
        databaseName = "local_db"
        databaseVersion = 1
    }

    fun getDatabase(): String{
        return " $databaseName - $databaseVersion"
    }


}
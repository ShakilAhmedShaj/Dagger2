package com.decimalab.dagger2.data.database

import android.content.Context

class DatabaseService(
    context: Context,
    databaseName: String,
    databaseVersion: Int
) {

    private var mDatabaseName: String = ""
    private var mDatabaseVersion: Int = 0
    private var mContext: Context? = null

    init {
        mContext = context
        mDatabaseName = databaseName
        mDatabaseVersion = databaseVersion
    }

    fun getDatabase(): String {
        return " $mDatabaseName - $mDatabaseVersion"
    }


}
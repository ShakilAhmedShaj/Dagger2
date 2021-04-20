package com.decimalab.dagger2.data.database

import android.content.Context
import com.decimalab.dagger2.di.qualifier.DatabaseName
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DatabaseService @Inject constructor(
    context: Context,
    @DatabaseName databaseName: String,
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
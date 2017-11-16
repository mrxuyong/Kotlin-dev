package com.xuyong.myweather

import android.app.Application

/**
 * @name .kt
 * @desc
 * @author: Created by XuYong of1615 on 2017/11/3
 */
class AppContext : Application() {

    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    companion object {
        var instance: AppContext? = null
            private set
    }
}

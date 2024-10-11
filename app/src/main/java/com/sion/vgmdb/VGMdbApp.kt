package com.sion.vgmdb

import android.app.Application
import android.content.Context
import com.tencent.mmkv.MMKV

class VGMdbApp: Application() {

    override fun onCreate() {
        super.onCreate()
        appContext = this
        app = this
        MMKV.initialize(this)
    }
}


lateinit var appContext: Context
lateinit var app: Application
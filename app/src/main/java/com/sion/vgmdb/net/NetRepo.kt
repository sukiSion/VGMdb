package com.sion.vgmdb.net

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

abstract class NetRepo<T> {

    protected abstract val mBaseUrl: String

    protected abstract val mServiceClz: Class<T>

    protected val mService by lazy {
        NetClient.getRetrofit(mBaseUrl).create(mServiceClz)
    }

}




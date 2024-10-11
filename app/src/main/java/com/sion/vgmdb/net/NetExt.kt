package com.sion.vgmdb.net

import androidx.lifecycle.flowWithLifecycle
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.onStart

fun interface NetCallBack<T>{
    fun onSuccess(result: T)
    fun onFailure(error: Throwable){}
    fun onStart(){}
}

suspend fun <T> Flow<T>.netCollect(callBack: NetCallBack<T>){
    flowOn(Dispatchers.IO).onStart {
        callBack.onStart()
    }.catch {
        callBack.onFailure(it)
    }.collect{
        callBack.onSuccess(it)
    }
}
package com.sion.vgmdb.net

import android.os.Build
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.time.Duration
import java.util.concurrent.TimeUnit

object NetClient {

    private const val BANGUMI_BASE_URL = "https://api.bgm.tv/"

    private const val TIME_OUT = 3 * 60 * 1000L

    private val retrofitCache: MutableMap<String , Retrofit> by lazy { mutableMapOf() }

    private fun createRetrofitClient(
        baseUrl: String
    ) = OkHttpClient.Builder()
            .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
            .callTimeout(TIME_OUT , TimeUnit.MILLISECONDS)
            .readTimeout(TIME_OUT , TimeUnit.MILLISECONDS)
            .writeTimeout(TIME_OUT , TimeUnit.MILLISECONDS)
            .connectTimeout(TIME_OUT , TimeUnit.MILLISECONDS)
            .build().run {
                Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(this)
                    .build()
            }

    fun getRetrofit(baseUrl: String) = retrofitCache.getOrPut(baseUrl){ createRetrofitClient(baseUrl) }
}

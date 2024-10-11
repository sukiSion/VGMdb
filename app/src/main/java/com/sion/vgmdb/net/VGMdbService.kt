package com.sion.vgmdb.net

import com.sion.vgmdb.bean.vgmdb.Album
import retrofit2.http.GET
import retrofit2.http.Path

interface VGMdbService {

    @GET("/album/{id}")
    suspend fun getAlbumInfo(@Path("id") id: Int): Album


}
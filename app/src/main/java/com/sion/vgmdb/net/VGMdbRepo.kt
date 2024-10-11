package com.sion.vgmdb.net

object VGMdbRepo: NetRepo<VGMdbService>() {

    override val mBaseUrl: String
        get() = "https://vgmdb.info/"

    override val mServiceClz: Class<VGMdbService>
        get() = VGMdbService::class.java

    suspend fun getAlbumInfo(
        id: Int
    ){

    }
}
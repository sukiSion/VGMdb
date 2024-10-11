package com.sion.vgmdb.bean.vgmdb

import com.google.gson.annotations.SerializedName

data class Album(
    val arrangers: List<Arranger?>?,
    val barcode: String?,
    val catalog: String?,
    val categories: List<String?>?,
    val category: String?,
    val classification: String?,
    val composers: List<Composer?>?,
    val covers: List<Cover?>?,
    val discs: List<Disc?>?,
    val distributor: Distributor?,
    val link: String?,
    val lyricists: List<Lyricist?>?,
    val media_format: String?,
    val meta: Meta?,
    val name: String?,
    val names: Names?,
    val notes: String?,
    val organizations: List<Organization?>?,
    val performers: List<Any?>?,
    val picture_full: String?,
    val picture_small: String?,
    val picture_thumb: String?,
    val platforms: List<String?>?,
    val products: List<Product?>?,
    val publish_format: String?,
    val publisher: Publisher?,
    val related: List<Related?>?,
    val release_date: String?,
    val release_events: List<ReleaseEvent?>?,
    val release_price: ReleasePrice?,
    val reprints: List<Any?>?,
    val stores: List<Store?>?,
    val vgmdb_link: String?,
    val vocals: List<Vocal>?,
    val votes: Int?,
    val websites: Websites?
)

data class Arranger(
    val link: String?,
    val names: Names?
)

data class Composer(
    val link: String?,
    val names: Names?
)

data class Cover(
    val full: String?,
    val medium: String?,
    val name: String?,
    val thumb: String?
)

data class Disc(
    val disc_length: String?,
    val name: String?,
    val tracks: List<Track?>?
)

data class Distributor(
    val link: String?,
    val names: Names?,
    val role: String?
)

data class Lyricist(
    val link: String?,
    val names: Names?
)

data class Meta(
    val added_date: String?,
    val edited_date: String?,
    val fetched_date: String?,
    val ttl: Int?,
    val visitors: Int?
)

data class Organization(
    val link: String?,
    val names: Names?,
    val role: String?
)

data class Product(
    val link: String?,
    val names: Names?
)

data class Publisher(
    val link: String?,
    val names: Names?,
    val role: String?
)

data class Related(
    val catalog: String?,
    val link: String?,
    val names: Names?,
    val type: String?
)

data class ReleaseEvent(
    val link: String?,
    val name: String?,
    val shortname: String?
)

data class ReleasePrice(
    val currency: String?,
    val price: Double?
)

data class Store(
    val link: String?,
    val name: String?
)

data class Vocal(
    val link: String?,
    val names: Names?
)

data class Websites(
    val Review: List<Review?>?
)

data class Names(
    val en: String?,
    val ja: String?,
    @SerializedName("ja-lath")
    val ja_latn: String?
)

data class Track(
    val names: TrackName?,
    val track_length: String?
)

data class TrackName(
    val English: String?,
    val Japanese: String?,
    val Romaji: String?
)

data class Review(
    val link: String?,
    val name: String?
)
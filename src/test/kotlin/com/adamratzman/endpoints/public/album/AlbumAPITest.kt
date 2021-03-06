package com.adamratzman.endpoints.public.album

import junit.framework.TestCase
import com.adamratzman.main.SpotifyAPI

class AlbumAPITest : TestCase() {
    val api = SpotifyAPI.Builder("79d455af5aea45c094c5cea04d167ac1", "").build()

    fun testGetAlbum() {
        println(api.albums.getAlbum("0dzeoQhVNzKkwM5ieOJC54"))
    }

    fun testGetAlbums() {
        println(api.albums.getAlbums(null, "4wHI7bZSdSQAbiVElWBlSO", "0dzeoQhVNzKkwM5ieOJC54"))
    }

    fun testGetAlbumTracks() {
        println(api.albums.getAlbumTracks("4wHI7bZSdSQAbiVElWBlSO"))
    }

}
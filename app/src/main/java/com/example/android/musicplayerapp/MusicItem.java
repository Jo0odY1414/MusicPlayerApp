package com.example.android.musicplayerapp;

/**
 * Created by a0 on 5‏/8‏/2017.
 */

public class MusicItem {

    int image;
    String nameSong;
    String artistsName;
    String albumName;
    int mediaPlayer;
    String price;

    public MusicItem(int image, String nameSong, String artistsName, String albumName, int mediaPlayer, String price) {
        this.image = image;
        this.nameSong = nameSong;
        this.artistsName = artistsName;
        this.albumName = albumName;
        this.mediaPlayer = mediaPlayer;
        this.price = price;
    }

    public MusicItem(int image, String nameSong, String artistsName, int mediaPlayer, String price) {
        this.image = image;
        this.nameSong = nameSong;
        this.artistsName = artistsName;
        this.mediaPlayer = mediaPlayer;
        this.price = price;
    }

    public MusicItem(int image, String artistsName, String albumName, String price) {
        this.image = image;
        this.artistsName = artistsName;
        this.albumName = albumName;
        this.price = price;
    }

    public MusicItem(int image, String nameSong, String artistsName, int mediaPlayer) {
        this.image = image;
        this.nameSong = nameSong;
        this.artistsName = artistsName;
        this.mediaPlayer = mediaPlayer;
    }

    public MusicItem(String nameSong, String artistsName, int mediaPlayer) {
        this.nameSong = nameSong;
        this.artistsName = artistsName;
        this.mediaPlayer = mediaPlayer;
    }

    public MusicItem(int image, String nameSong, int mediaPlayer) {
        this.image = image;
        this.nameSong = nameSong;
        this.mediaPlayer = mediaPlayer;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public String getArtistsName() {
        return artistsName;
    }

    public void setArtistsName(String artistsName) {
        this.artistsName = artistsName;
    }

    public int getMediaPlayer() {
        return mediaPlayer;
    }

    public void setMediaPlayer(int mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }
}

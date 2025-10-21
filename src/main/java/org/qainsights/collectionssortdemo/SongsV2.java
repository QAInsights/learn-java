package org.qainsights.collectionssortdemo;

import java.util.List;

public class SongsV2 {
    private String title;
    private String artist;
    private int bpm;

    public SongsV2(String title, String artist, int bpm) {
        this.title = title;
        this.artist = artist;
        this.bpm = bpm;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getBpm() {
        return bpm;
    }

    public String toString() {
        return title;
    }
}

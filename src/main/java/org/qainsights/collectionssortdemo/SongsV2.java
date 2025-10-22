package org.qainsights.collectionssortdemo;

import java.util.List;

public class SongsV2 implements Comparable<SongsV2> {
    private String title;
    private String artist;
    private int bpm;

    public SongsV2(String title, String artist, int bpm) {
        this.title = title;
        this.artist = artist;
        this.bpm = bpm;
    }


    @Override
    public int hashCode() {
        return title.hashCode();
    }

    public boolean equals(SongsV2 other) {
        SongsV2 o = (SongsV2) other;
        return title.equals(o.getTitle());
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

    @Override
    public int compareTo(SongsV2 o) {
        return title.compareTo(o.getTitle());
    }
}

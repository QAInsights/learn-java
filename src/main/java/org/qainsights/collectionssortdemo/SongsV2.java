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

    public int hashCode() {
        return title.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj instanceof SongsV2 other) {
            return this.title.equals(other.getTitle());
        }
        return false;
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

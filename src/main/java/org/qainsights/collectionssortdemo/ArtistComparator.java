package org.qainsights.collectionssortdemo;

import java.util.Comparator;

public class ArtistComparator implements Comparator<SongsV2> {
    @Override
    public int compare(SongsV2 o1, SongsV2 o2) {
        return o1.getArtist().compareTo(o2.getArtist());
    }
}

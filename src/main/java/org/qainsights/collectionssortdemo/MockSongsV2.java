package org.qainsights.collectionssortdemo;

import java.util.ArrayList;
import java.util.List;

public class MockSongsV2 {
    public static List<SongsV2> getSongsV2() {
        ArrayList<SongsV2> songsV2 = new ArrayList<SongsV2>();
        songsV2.add(new SongsV2("Harry Potter", "Harry Potter", 10));
        songsV2.add(new SongsV2("Cello", "Hello", 191));
        songsV2.add(new SongsV2("Cello", "Hello", 191));
        songsV2.add(new SongsV2("roar", "Harry", 192));
        songsV2.add(new SongsV2("12 Hotel California", "Hotel California", 193));
        songsV2.add(new SongsV2("zzzz", "zzz", 11));
        songsV2.add(new SongsV2("umbrella", "Umbrella", 20));
        return songsV2;
    }
}

package org.qainsights.collectionssortdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSortDriver {
    static void main() {
        List<String> getSongs = MockingSongs.getSongs();
        System.out.println(getSongs);

        System.out.println("After sorting...");

        Collections.sort(getSongs);
        System.out.println(getSongs);

        List<SongsV2> s2 = MockSongsV2.getSongsV2();
        System.out.println(s2);

        System.out.println("After sorting...v2");
        Collections.sort(s2);
        System.out.println(s2);


    }
}

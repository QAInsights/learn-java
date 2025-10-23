package org.qainsights.collectionssortdemo;

import java.util.*;

public class CollectionsSortDriver {
    public static void main() {
//        List<String> getSongs = MockingSongs.getSongs();
//        System.out.println(getSongs);
//
//        System.out.println("After sorting...");
//
//        Collections.sort(getSongs);
//        System.out.println(getSongs);

        List<SongsV2> s2 = MockSongsV2.getSongsV2();
        System.out.println(s2);

//        System.out.println("After sorting...v2");
//        Collections.sort(s2);
//        System.out.println(s2);

        ArtistComparator ac = new ArtistComparator();
//        s2.sort(ac);
        System.out.println("After sorting by artist...");


        // Simply put
        s2.sort((one, two) -> one.getTitle().compareTo(two.getTitle()));

        System.out.println(s2);

        System.out.println("After sorting by title... descending...");
        s2.sort((one, two) -> two.getArtist().compareTo(one.getArtist()));
        System.out.println(s2);

        // BPM
        s2.sort((o1, o2) -> o1.getBpm() - o2.getBpm());
        System.out.println("After sorting by BPM...");
        System.out.println(s2);

        // Set
        Set<SongsV2> s3 = new HashSet<>(s2);
        System.out.println("After putting in Set...");
        System.out.println(s3);


//
//        List<SongsV2> v1 = MockSongsV2.getSongsV2();
//        List<SongsV2> v2 = MockSongsV2.getSongsV2();
//
//        System.out.println(v1.getLast().hashCode());
//        System.out.println(v2.getLast().hashCode());
//
//        int a = 11;
//        int b = 11;
//
//        System.out.println(Integer.toString(a).hashCode() + "-"
//                + Integer.toString(b).hashCode());
//
//        System.out.println(Integer.toString(a).equals(Integer.toString(b)));
//        System.out.println(a == b);

    }
}

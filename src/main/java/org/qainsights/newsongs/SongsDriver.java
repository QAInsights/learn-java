package org.qainsights.newsongs;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SongsDriver {
    static void main() {

        List<Song> s = new SongsDriver().getSongs();
        Stream<Song> st = s.stream()
                .filter(song -> song.getGenre().contains("Rock"));
        List<Song> res = st.collect(Collectors.toList());
        System.out.println(res);

        List<Song> beatles = new SongsDriver().getSongs();
        List<Song> st2 = beatles.stream()
                .filter(song -> song.getArtist().equals("The Beatles"))
                .filter(song -> song.getTitle().startsWith("C"))
                .filter(song -> song.getYear() > 1995)
                .collect(Collectors.toList());
        System.out.println(st2);

        // List all the genres
        List<Song> allGenres = new SongsDriver().getSongs();

        String allGenresStream = allGenres.stream()
                .map(sg -> sg.getTitle())
                .collect(Collectors.joining("-", "A", "G"));
        System.out.println(allGenresStream);

        Function<Song, String> gg = sf -> sf.getGenre();
        System.out.println(gg.apply(new Song("test", "ter", "e", 123333, 12333)));


    }

    public List<Song> getSongs() {
        return List.of(
                new Song("$10", "Hitchhiker", "Electronic", 2016, 183),
                new Song("Havana", "Camila Cabello", "R&B", 2017, 324),
                new Song("Cassidy", "Grateful Dead", "Rock", 1972, 123),
                new Song("50 ways", "Paul Simon", "Soft Rock", 1975, 199),
                new Song("Hurt", "Nine Inch Nails", "Industrial Rock", 1995, 257),
                new Song("Silence", "Delerium", "Electronic", 1999, 134),
                new Song("Hurt", "Johnny Cash", "Soft Rock", 2002, 392),
                new Song("Watercolour", "Pendulum", "Electronic", 2010, 155),
                new Song("The Outsider", "A Perfect Circle", "Alternative Rock", 2004, 312),
                new Song("With a Little Help from My Friends", "The Beatles", "Rock", 1967, 168),
                new Song("Come Together", "The Beatles", "Blues rock", 1968, 173),
                new Song("Come Together", "Ike & Tina Turner", "Rock", 1970, 165),
                new Song("With a Little Help from My Friends", "Joe Cocker", "Rock", 1968, 46),
                new Song("Immigrant Song", "Karen O", "Industrial Rock", 2011, 12),
                new Song("Breathe", "The Prodigy", "Electronic", 1996, 337),
                new Song("What's Going On", "Gaye", "R&B", 1971, 420),
                new Song("Hallucinate", "Dua Lipa", "Pop", 2020, 75),
                new Song("Walk Me Home", "P!nk", "Pop", 2019, 459),
                new Song("I am not a woman, I'm a god", "Halsey", "Alternative Rock", 2021, 384),
                new Song("Pasos de cero", "Pablo Alborán", "Latin", 2014, 117),
                new Song("Smooth", "Santana", "Latin", 1999, 244),
                new Song("Immigrant song", "Led Zeppelin", "Rock", 1970, 484));
    }

}

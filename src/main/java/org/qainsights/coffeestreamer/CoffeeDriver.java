package org.qainsights.coffeestreamer;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CoffeeDriver {

    public static void main(String[] args) {

        Map<String, Integer> c = Coffee.getCoffeeWithCaffine();
        System.out.println(c);

        Map<String, Integer> st = c.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        k -> k.getKey(),
                        v -> v.getValue(),
                        (existing, replacement) -> existing, // merge function (not needed here)
                        LinkedHashMap::new
                ));

        Map.Entry<String, Integer> c2 =  // Remove the variable assignment and just use ifPresent for printing
                st.entrySet().stream()
                        .findFirst()
                        .orElseGet(() -> null);
        System.out.println(c2);


    }
}

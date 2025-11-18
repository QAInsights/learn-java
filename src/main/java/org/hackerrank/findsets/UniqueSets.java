package org.hackerrank.findsets;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueSets {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        HashSet<String> pair = new HashSet<>();


        for (int i = 0; i < t; i++) {

            String uniquePair = pair_left[i].trim() + "," + pair_right[i].trim();
            String reversePair = pair_right[i].trim() + "," + pair_left[i].trim();
            if (!pair.contains(reversePair))
                pair.add(uniquePair);
            System.out.println(pair.size());

        }
    }

}

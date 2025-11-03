package org.qainsights.chapter4;

import java.util.Arrays;

public class Q6 {
    public static void main(String[] args) {
        String[][] chars = new String[2][];
        chars[0] = new String[2];
        chars[1] = new String[4];
        char cha = 97;

        for (char c = 0; c < chars.length; c++) {
            for (char ch = 0; ch < chars.length; ch++) {
                chars[c][ch] = "-" + cha;
                cha++;
            }
        }
        System.out.println(Arrays.deepToString(chars));

        for (String[] chara : chars) {
            for (String s : chara) {
                s = "-" + cha;
                cha++;
            }
            System.out.println(Arrays.deepToString(chara));
        }

    }
}

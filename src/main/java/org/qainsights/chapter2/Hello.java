package org.qainsights.chapter2;

public class Hello {

    static int j;

    public static void main(String[] args) {
        int i;
        i = 1;
        System.out.println(i++); // prints 1, then increment 2
        System.out.println(i); // 2
        System.out.println(++i); // increment 2, prints 3
        System.out.println(i); // 3

        System.out.println(j);

        // for
        FOR_LOOP: for (j = 1; j <= 5; j++) {
            System.out.println(j);
            continue FOR_LOOP;
        }

        OUTER: for (j = 11; j <= 15; j++) {
            INNER: for (j = 11; j <= 15; j++) {
                if (j >= 11)
                    break OUTER;
                else
                    continue INNER;
            }
        }

        int num = 100_000___000;
        System.out.println(num); // valid

        int k = 111____1111;
        System.out.println(k); // valid

        // int z = __111; //invalid

    }
}

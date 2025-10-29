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

        double pi = 3.14;
        System.out.println(pi);

        long l = 151512232323L;
        System.out.println(l);

        float pi2 = 3.14f; // add f
        float pi3 = 3.14F; // add F
        System.out.println(pi2);
        System.out.println(pi3);

        char ini = 'N';
        System.out.println(ini);

        char t = '\u0102';
        System.out.println(t);

        String name = "NaveenKumar";
        System.out.println(name);

        boolean x = true;
        System.out.println(x);

        int hx = 0X1F;
        System.err.println(hx); // 31

        int hx1 = 0xFF;
        System.err.println(hx1); // 255

        byte bb = -128; // byte is 8 bits from -128 to 127
        System.err.println(bb);

        short xs = 1;
        System.err.println(xs);

        int kk = xs;
        kk = 146523234;
        int ll = (int) xs;
        System.out.println(xs);

        short r = (short) 111211111;
        int rr = (int) r;
        System.out.println(r);

        int t1 = (int) r;
        System.err.println(t1);

        byte bbb = -127;
        int kkk = (int) bbb;
        System.out.println(bbb);

        short dd = 32005;
        byte ff = (byte) dd;
        System.out.println(ff);

    }
}

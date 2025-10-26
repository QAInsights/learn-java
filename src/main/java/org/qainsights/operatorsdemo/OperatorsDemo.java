package org.qainsights.operatorsdemo;

public class OperatorsDemo {
    void main(String[] args) {
//        int i = 1;
//        System.out.println(++i); // 2
//        System.out.println(i); //2
//        System.out.println(i++); //2
//        System.out.println(i); //3
//
//        System.out.println(11 / 3);
//        System.out.println(1.0 / 2.2);
//
//        long l = 1;
//        int a = 11;
//        var t = l + a;
//        System.out.println(getTypeOf(t));
//        System.out.println(getTypeOf(a));
//        System.out.println(getTypeOf(l));
//
//        String name = "abcd";
//        System.out.println(name.codePointAt(0));
//        System.out.println(name.codePointCount(0, name.length())); //4
//
//        Predicate<String> p = s -> s.length() > 1;
//        System.out.println(p.test("nkn")); // true
//        System.out.println(p.test("")); // false
//
//        Predicate<Integer> ii = ij -> ij > 1;
//        System.out.println(ii.test(1)); // false

//        go();

        q1();

    }

    void q1() {
        int x = 0;
        int y = 30;

        for (int outer = 0; outer < 3; outer++) {
            for (int inner = 4; inner > 1; inner--) {
                x++;
                y = y - 2;
                if (x == 6) {
                    break;
                }
                x = x + 3;

            }
            y = y - 2;

            System.out.println("Outer " + outer + "-" + x + "-" + y);

        }
        /*
        0 4 -  28 3
        0 3 -  26 6
        0 2 -  24 6

         */

    }

    void go() {
        int value = 7;
        for (int i = 1; i < 8; i++) {
//            System.out.println("BBB" + value);
            value++; // 7 9 11 13 15
            System.out.println("AAA " + i + "-" + value); //8 9 10 11 12 14
            if (i > 4) {
                System.out.println(++value + "-"); // 13 15
            }
            if (value > 14) {
                System.out.println("i = " + i); //
                break;
            }
        }
    }

    public Object getTypeOf(Object t) {
        return (t.getClass().getName());
    }
}

package org.qainsights.stringdemo;

public class StringDemos {
    static void main() {
        String s1 = "Hello";
        System.out.println(s1);

        System.out.println(1 + 2);           // 3
        System.out.println("a" + "b");       // ab
        System.out.println("a" + "b" + 3);   // ab3
        System.out.println(1 + 2 + "c");     // 3c
        System.out.println("c" + 1 + 2);     // c12
        System.out.println("c" + null);      // cnull

        int three = 3;
        String four = "4";
        System.out.println(1 + 2 + three + four); //3+3+four //6+ four //64
        System.out.println(6 + four); //64 - because four is a string

        var s = "1";
        s += "2"; // s = s + "2" // s = "1" + "2" // s = "12"
        s += 3; // s = "12" + 3 // 123
        System.out.println(s); //  123

        var name = "animals";
        System.out.println(name.length()); //7

        System.out.println(name.charAt(0)); //a
//        System.out.println(name.charAt(-1)); // StringIndexOutOfBoundsException
//        System.out.println(name.charAt(7)); // StringIndexOutOfBoundsException

        var cp = "abcdefghijklmnopqrstuvwxyz-ABCDEFGHIJKLIMNOPQRSTUVWXYZ è";
        System.out.println(cp.codePoints());
        System.out.println(cp.codePoints().count());

        System.out.println(cp.codePointAt(5));
        System.out.println(cp.codePointBefore(5));

        for (int i = 0; i < cp.length(); i++) {
            System.out.println("Code Point of " + cp.charAt(i) + " is " + cp.codePointAt(i));
        }

        // Substring
        System.out.println(name.substring(1)); //nimals
        System.out.println(name.substring(1, 3)); // ni
        System.out.println(name.substring(3, 3)); //empty string
//        System.out.println(name.substring(3, 8)); //StringIndexOutOfBoundsException

        //animals
        System.out.println(name.indexOf('a')); //0
        System.out.println(name.indexOf("al")); //4
        System.out.println(name.indexOf('a', 4));

        // Formatting
        var item = "Apple";
        var price = 11.22;
        System.out.println(String.format("Item name is %s and it's price is %f", item, price));
        System.out.println(String.format("Item name is %s and it's price is %f".formatted(item, price)));

        // %s string
        // %f float
        // %d integer
        // %n new line
        System.out.println(String.format("Item is %s %n and price is %f".formatted(item, price)));

        var pi = 3.14159;
        System.out.println(String.format("Pi is %f", pi));
        System.out.println(String.format("Pi is %.2f", pi));
        System.out.println(String.format("Pi is %12.2f", pi));
        System.out.println(String.format("Pi is %.3f", pi));

        var result = "Hello World 123  ";
        System.out.println(result.trim().toUpperCase().indexOf('r'));
        System.out.println(result.trim().toLowerCase().indexOf('r'));

        String a = "abc";
        String b = a.toUpperCase(); // ABC
        b = b.replace("B", "2").replace('C', '3'); // A2C > A23
        System.out.println("a=" + a); // abc
        System.out.println("b=" + b); // A23

        // Inefficient way
        String start = "";
        for (char letter = 'a'; letter <= 'z'; letter++) {
            start += letter; // a + b // ab + c // abc + d
        }
        System.out.println(start);
        // Efficient way

        StringBuilder sb = new StringBuilder();
        for (char letter = 'a'; letter <= 'z'; letter++) {
            sb.append(letter);
            System.gc();
        }
        System.out.println(sb);
        System.out.println(sb.getClass().getSimpleName());

        StringBuilder a1 = new StringBuilder("abc");
        StringBuilder b1 = a1.append("de"); //abcde
        b1 = b1.append("f").append("g"); //abcdefg
        System.out.println("a=" + a1); // abcde
        System.out.println("b=" + b1); // abcdefg

        StringBuilder sb1 = new StringBuilder(11);
        sb1.append("Hello World 123");
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());

        var sb2 = new StringBuilder().append('c').append('a').append('t');
        sb2.append("Hello");
        sb2.append("Hello World 123");
        sb2.append('-').append(1223).append(true);
        sb2.appendCodePoint(8217);
        System.out.println(sb2);

        sb2.insert(2, "111");
        System.out.println(sb2);

        sb2.insert(3, "222");
        System.out.println(sb2);

        sb2.delete(0, 1);
        System.out.println(sb2);

        var newname = new StringBuilder("Hello");
        newname.delete(0, 2);
        System.out.println(newname);
        newname.insert(0, "He");
        System.out.println(newname);

        newname.replace(5, 11, " World");
        System.out.println(newname);
    }
}

package org.qainsights.RecordsDemo;

public class RecordsDriver {
    static void main() {
        RecordsDemo rec = new RecordsDemo("N", 24);
        System.out.println(rec.name() + ":" + rec.age());

        RecordsDemo newrec = new RecordsDemo("D", 11);
        System.out.println(newrec.name() + ":" + newrec.age());

    }
}

package org.qainsights.adhoc;

public class HelloClass {
    private String name;

    HelloClass(String name) {
        this.name = name;
    }

    public String toString() {
        return callAnother(this.name);
    }

    private String callAnother(String n) {
        return callAnother(n, n);
    }

    private String callAnother(String n, String o) {
        return "nnk " + "NON";
    }
    
}

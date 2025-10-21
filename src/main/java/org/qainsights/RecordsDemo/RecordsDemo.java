package org.qainsights.recordsdemo;

public record RecordsDemo(String name, int age) {

    public RecordsDemo() {
        this("", 0);
    }

    public void setName(String name) {
    }

    public void setAge(int age) {
    }
}

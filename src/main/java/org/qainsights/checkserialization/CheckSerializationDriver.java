package org.qainsights.checkserialization;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class CheckSerializationDriver implements Serializable {

    private String name;
    private int age;
    private int height;
    private static final long serialVersionUID = 1L;
    private int weight;

    public static void main(String[] args) throws IOException {
        CheckSerializationDriver c = new CheckSerializationDriver("Hello", 22, 11, 12);

        FileOutputStream fs = new FileOutputStream("Writing.ser");
        ObjectOutputStream os = new ObjectOutputStream(fs);

        os.writeObject(c);
        os.close();

    }

    public CheckSerializationDriver(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }
}

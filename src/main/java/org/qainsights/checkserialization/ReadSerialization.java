package org.qainsights.checkserialization;

import java.io.FileInputStream;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class ReadSerialization implements Serializable {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fs = new FileInputStream("Writing.ser");
        ObjectInputStream os = new ObjectInputStream(fs);

        CheckSerializationDriver ck = (CheckSerializationDriver) os.readObject();
        System.out.println(ck.getName());
        os.close();

    }

}

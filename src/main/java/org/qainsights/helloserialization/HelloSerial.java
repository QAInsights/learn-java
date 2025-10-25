package org.qainsights.helloserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class HelloSerial implements Serializable {

    private String name;
    transient private Double points;
    private String[] interests;
    private static final long serialVersionUID = 7213843481667639422L;


    public static void main(String[] args) throws ClassNotFoundException {

        HelloSerial h = new HelloSerial("nk",
                22.0,
                new String[]{"test", "code", "security", "ccc"});

        HelloSerial h2 = new HelloSerial("pk",
                24,
                new String[]{"baking", "teaching"});

        // Let use Serializable

        try {
            FileOutputStream fs = new FileOutputStream("HelloSerial.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);

            os.writeObject(h);
            os.writeObject(h2);
            os.writeObject(h2.getClass().getSimpleName());

            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize

        try {
            FileInputStream fs = new FileInputStream("HelloSerial.ser");
            ObjectInputStream os = new ObjectInputStream(fs);

            HelloSerial o1 = (HelloSerial) os.readObject();
            HelloSerial o2 = (HelloSerial) os.readObject();

            o1.setPoints(24.0);
            o2.setPoints(33.2);

            System.out.println(o1);
            System.out.println(o2);

            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public HelloSerial(String name, double points, String... interests) {
        this.name = name;
        this.points = points;
        this.interests = interests;
    }

    public String toString() {
        return name + "," + points + "," + getInterests();
    }

    public String getInterests() {
        String total = "";
        for (String myInterests : interests) {
            total += myInterests + ",";
        }

        return total.substring(0, total.length() - 1);
    }

    public void setPoints(Double points) {
        this.points = points;
    }

}

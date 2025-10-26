package org.qainsights.writingtofiledemo;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFileDemoDriver {

    public static void main(String[] args) {

        try (FileWriter fw = new FileWriter("unbuffer.txt")) {

            long startTime = System.nanoTime();

            for (int i = 0; i < 100000; i++) {

                fw.write("Hello World \n");
                fw.write("Learning Advanced Concepts");

            }
            fw.close();

            startTime = System.nanoTime() - startTime;

            System.out.println("Time it took to complete this is " + startTime);
            //Time it took to complete this is 21977000


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

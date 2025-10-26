package org.qainsights.writingtofiledemo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingToBufferDemo {

    public static void main(String[] args) throws IOException {

        FileWriter fw;
        fw = new FileWriter("buffer.txt");
        try (BufferedWriter bWriter = new BufferedWriter(fw)) {

            long startTime = System.nanoTime();
            for (int i = 0; i < 100000; i++) {

                bWriter.write("Hello World \n");
                bWriter.write("Learning Advanced Concepts");
            }

            startTime = System.nanoTime() - startTime;
            System.out.println("Total time it took is " + startTime);

            // Total time it took is 9701600

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

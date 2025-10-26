package org.qainsights.writingtofiledemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFileBufferDemo {

    public static void main(String[] args) {

        try (FileReader f = new FileReader("myfile.txt")) {
            BufferedReader bw = new BufferedReader(f);

            String line;
            int lineNumber = 0;
            while ((line = bw.readLine()) != null) {
                ++lineNumber;
                System.out.println(lineNumber + ": " + line);
            }
            // bw.close(); // This is not required as BW will close automatically inside try-with-resources
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

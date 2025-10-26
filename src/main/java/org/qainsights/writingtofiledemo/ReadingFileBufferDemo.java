package org.qainsights.writingtofiledemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

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

        // Using streams
        AtomicInteger atomicInteger = new AtomicInteger(0);
        try {
            Files.lines(Paths.get("myfile.txt")).forEach((String line) ->
            {
                System.out.println(line + ": " + (atomicInteger.getAndIncrement() + 1));
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a string and press Enter key: ");
            String str = scanner.nextLine();

            for (String s : str.contains(";") ? str.split("; ") : str.split(" ")) {
                if (!s.isEmpty()) {
                    System.out.println(s);
                }
            }
        }

    }
}

package org.qainsights.writingtofiledemo;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileNioDemoDriver {

    public static void main(String[] args) {

        Path path = Paths.get("newfile.txt");
        System.out.println(path.getFileName());

        try (BufferedWriter bw = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {
            bw.write("Hello");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}

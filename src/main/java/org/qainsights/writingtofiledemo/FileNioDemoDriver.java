package org.qainsights.writingtofiledemo;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.*;

public class FileNioDemoDriver {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("newfile.txt");
        System.out.println(path.getFileName());

        Path p2 = Paths.get("myfolder", "myfile.txt");
        System.out.println(p2.getFileName());

        // Creating a file
        try {
            if (Files.notExists(path))
                Files.createFile(path);
            if (Files.notExists(p2)) {
                Files.createDirectories(p2.getParent());
                System.out.println("Parent dir name " + p2.getParent());
                Files.createFile(p2);
                System.out.println("Created parent dir name " + p2.getParent() + "and a file at  " + p2.getFileName());
            }

            // Get Basic file attributes
            BasicFileAttributes attributes = Files.readAttributes(p2, BasicFileAttributes.class);
            System.out.println(attributes.lastModifiedTime());
            System.out.println(attributes.lastAccessTime());
            System.out.println(attributes.creationTime());

            boolean deleted = Files.deleteIfExists(p2);
            if (deleted) {
                System.out.println("Deleted the file at " + p2.getFileName());
            }

            // Deleting directory
            boolean isDir = Files.isDirectory(p2.getParent());
            if (isDir) {
                Files.delete(p2.getParent());
                System.out.println("Directory deleted");
            } else {
                System.out.println("Not deleted a dir");
            }

        } catch (FileAlreadyExistsException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }

        // try (BufferedWriter bw = Files.newBufferedWriter(path,
        // StandardCharsets.UTF_8)) {
        // bw.write("Hello");
        // System.out.println(path);
        // } catch (IOException e) {
        // throw new RuntimeException(e);
        // }

    }

}

package com.naidiuk;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class UserStorage {

    private static Path path = Path.of("src/main/resources/UserStorage.txt");

    public static void writeToFile(ArrayList<String> users) {
        createFile();
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            for (int i = 0; i < users.size(); i++) {
                String userInfo = users.get(i);
                writer.write(userInfo);
            }
        } catch (IOException e) {
            throw new RuntimeException("IO exception");
        }
    }

    private static void createFile() {
        if (Files.notExists(path)) {
            try {
                Files.createFile(path);
            } catch (IOException e) {
                throw new RuntimeException("IO exception");
            }
        }
    }
}

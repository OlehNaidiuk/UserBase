package com.naidiuk;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public final class UserList {

    private static final Path path = Path.of("src/main/resources/UsersInfo.txt");

    public static void writeToFile() {
        try (var writer = Files.newBufferedWriter(path)) {
            for (int i = 0; i < 10; i++) {
                writer.write(String.valueOf(new User()));
            }
        } catch (IOException e) {
            throw new RuntimeException("IO exception");
        }
    }

    public static void writeToFile(int numberOfUsers) {
        try (var writer = Files.newBufferedWriter(path)) {
            for (int i = 0; i < numberOfUsers; i++) {
                writer.write(String.valueOf(new User()));
            }
        } catch (IOException e) {
            throw new RuntimeException("IO exception");
        }
    }
}

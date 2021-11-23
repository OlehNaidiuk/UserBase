package com.naidiuk;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class UserStorage {

    private final Path path = Path.of("src/main/resources/UserStorage.txt");

    public Path getStoragePath() {
        return path;
    }

    public void createStorage() {
        if (Files.notExists(path)) {
            try {
                Files.createFile(path);
            } catch (IOException e) {
                throw new RuntimeException("Can not create file", e);
            }
        }
    }
}

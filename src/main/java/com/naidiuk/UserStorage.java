package com.naidiuk;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class UserStorage {

    private final Path path = Path.of("src/main/resources/UserStorage.txt");
    private User user;

    public Path getStoragePath() {
        return path;
    }

    public void writeToStorage() {
        createStorage();
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            for (int i = 0; i < 10; i++) {
                user = RandomUserGenerator.createRandomUser();
                writer.write(toString());
            }
        } catch (IOException e) {
            throw new RuntimeException("Can't find storage", e);
        }
    }

    public void writeToStorage(int numberOfUsers) {
        createStorage();
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            for (int i = 0; i < numberOfUsers; i++) {
                user = RandomUserGenerator.createRandomUser();
                writer.write(toString());
            }
        } catch (IOException e) {
            throw new RuntimeException("Can't find storage", e);
        }
    }

    public List<String> readFromStorage() {
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            List<String> users = new ArrayList<>();
            while (reader.ready()) {
                users.add(reader.readLine());
            }
            return users;
        } catch (IOException e) {
            throw new RuntimeException("Can't find storage", e);
        }
    }

    private void createStorage() {
        if (Files.notExists(path)) {
            try {
                Files.createFile(path);
            } catch (IOException e) {
                throw new RuntimeException("Can not create file", e);
            }
        }
    }

    @Override
    public String toString() {
        return String.format("%d, %s, %d, %s\n", user.getId(), user.getName(), user.getAge(), user.getStatus());
    }
}

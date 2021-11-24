package com.naidiuk;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class UserService {

    private User user;
    private RandomUserGenerator randomUserGenerator;
    private UserStorage userStorage;

    public void writeToStorage() {
        randomUserGenerator = new RandomUserGenerator();
        userStorage = new UserStorage();
        List<String> randomUsers = generateRandomUsers();
        userStorage.createStorage();
        try (BufferedWriter writer = Files.newBufferedWriter(userStorage.getStoragePath())) {
            for (String randomUser : randomUsers) {
                writer.write(randomUser);
            }
        } catch (IOException e) {
            throw new RuntimeException("IO exception", e);
        }
    }

    public void writeToStorage(int numberOfUsers) {
        randomUserGenerator = new RandomUserGenerator();
        userStorage = new UserStorage();
        List<String> randomUsers = generateRandomUsers(numberOfUsers);
        userStorage.createStorage();
        try (BufferedWriter writer = Files.newBufferedWriter(userStorage.getStoragePath())) {
            for (String user : randomUsers) {
                writer.write(user);
            }
        } catch (IOException e) {
            throw new RuntimeException("IO exception", e);
        }
    }

    public User createRandomUser() {
        user = new User();
        user.setName(randomUserGenerator.getRandomName());
        user.setId(randomUserGenerator.getRandomId());
        user.setAge(randomUserGenerator.getRandomAge());
        user.setStatus(randomUserGenerator.getRandomStatus());
        return user;
    }

    public List<String> generateRandomUsers() {
        List<String> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            user = createRandomUser();
            users.add(user.toString());
        }
        return users;
    }

    public List<String> generateRandomUsers(int numberOfUsers) {
        List<String> users = new ArrayList<>(numberOfUsers);
        for (int i = 0; i < numberOfUsers; i++) {
            user = createRandomUser();
            users.add(user.toString());
        }
        return users;
    }
}

package com.naidiuk;

import java.util.ArrayList;
import java.util.Random;

public class User {

    private int ID;
    private String name;
    private int age;
    private Status status;

    public User() {

    }

    public User(int ID, String name, int age, Status status) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.status = status;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Status getStatus() {
        return status;
    }

    public String toString() {
        return String.format("ID: %-15d Name: %-14s Age: %-5d Status: %-15s\n", ID, name, age, status);
    }

    public static ArrayList generateRandomUsers() {
        ArrayList<String> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = createRandomUser();
            users.add(i, user.toString());
        }
        return users;
    }

    public static ArrayList generateRandomUsers(int numberOfUsers) {
        ArrayList<String> users = new ArrayList<>(numberOfUsers);
        for (int i = 0; i < numberOfUsers; i++) {
            User user = createRandomUser();
            users.add(i, user.toString());
        }
        return users;
    }

    private int getRandomID() {
        Random random = new Random();
        return random.nextInt(Integer.MAX_VALUE);
    }

    private int getRandomAge() {
        Random random = new Random();
        return (random.nextInt(101 - 7) + 7);
    }

    private static User createRandomUser() {
        User user = new User();
        user.name = UserName.getRandomName();
        user.ID = user.getRandomID();
        user.age = user.getRandomAge();
        user.status = Status.getRandomStatus();
        return user;
    }
}

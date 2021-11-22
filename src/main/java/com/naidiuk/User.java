package com.naidiuk;

import java.util.Random;

public final class User {

    private static int ID;
    private static String name;
    private static int age;
    private static String status;

    User() {
        Random random = new Random();
        Status[] values = Status.values();
        ID++;
        name = String.valueOf(new UserName());
        age = random.nextInt(101 - 7) + 7;
        status = String.valueOf(values[random.nextInt(2)]);
    }

    public String toString() {
        return String.format("ID: %-15d Name: %-20s Age: %-15d Status: %-15s\n", ID, name, age, status);
    }
}

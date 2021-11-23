package com.naidiuk;

public class User {

    private int id;
    private String name;
    private int age;
    private Status status;

    public void setId(int id) {
        this.id = id;
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

    public int getId() {
        return id;
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

    @Override
    public String toString() {
        return String.format("%-15d %-15s %-5d %-15s\n", id, name, age, status);
    }
}

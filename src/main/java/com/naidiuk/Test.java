package com.naidiuk;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.writeUserInfo(34);
        List<String> users = userService.readUserInfo();
        System.out.println(users);
    }
}

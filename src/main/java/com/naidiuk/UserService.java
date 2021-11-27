package com.naidiuk;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    private final UserStorage userStorage = new UserStorage();

    public void writeUserInfo() {
        userStorage.writeToStorage();
    }

    public void writeUserInfo(int numberOfUsers) {
        userStorage.writeToStorage(numberOfUsers);
    }

    public List<User> readUserInfo() {
        List<String> usersInfo = userStorage.readFromStorage();
        List<User> users = new ArrayList<>();
        String[] temp;
        for (String userInfo : usersInfo) {
            temp = userInfo.split(", ");
            User user = new User();
            user.setId(Integer.parseInt(temp[0]));
            user.setName(temp[1]);
            user.setAge(Integer.parseInt(temp[2]));
            user.setStatus(Status.valueOf(temp[3]));
            users.add(user);
        }
        return users;
    }
}

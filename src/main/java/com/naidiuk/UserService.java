package com.naidiuk;

import java.util.List;

public class UserService {

    private final UserStorage userStorage = new UserStorage();

    public void writeUserInfo() {
        userStorage.writeToStorage();
    }

    public void writeUserInfo(int numberOfUsers) {
        userStorage.writeToStorage(numberOfUsers);
    }

    public List<String> readUserInfo() {
        List<String> users = userStorage.readFromStorage();
        String[] temp;
        for (int i = 0; i < users.size(); i++) {
            temp = users.remove(i).split(", ");
            User user = new User();
            user.setId(Integer.parseInt(temp[0]));
            user.setName(temp[1]);
            user.setAge(Integer.parseInt(temp[2]));
            user.setStatus(Status.valueOf(temp[3]));
            users.add(i, user.toString());
        }
        return users;
    }
}

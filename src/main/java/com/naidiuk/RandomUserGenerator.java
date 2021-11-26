package com.naidiuk;

import java.util.Random;

public class RandomUserGenerator {

    private static final String[] USER_NAMES = new String[]{"Stanislav", "Vladimir", "Vitaliy", "Dmitriy", "Oleh",
                        "Anatoliy", "Igor", "Valeriy", "Aleksandr", "Evgeniy", "Sergey", "Artem", "Viktor",
                        "Alena", "Aleksandra", "Natalia", "Anastasiya", "Fedor", "Olga", "Evgenia", "Lyudmila",
                        "Tatyana", "Ksenia", "Yulia", "Valentina", "Svetlana", "Ekaterina", "Irina", "Veronika"};
    private static final Random RANDOM = new Random();

    private static int getRandomId() {
        return RANDOM.nextInt(Integer.MAX_VALUE);
    }

    private static String getRandomName() {
        return USER_NAMES[(RANDOM.nextInt(USER_NAMES.length))];
    }

    private static int getRandomAge() {
        return (RANDOM.nextInt(101 - 7) + 7);
    }

    private static Status getRandomStatus() {
        Status[] values = Status.values();
        return values[RANDOM.nextInt(2)];
    }

    public static User createRandomUser() {
        User user = new User();
        user.setName(getRandomName());
        user.setId(getRandomId());
        user.setAge(getRandomAge());
        user.setStatus(getRandomStatus());
        return user;
    }
}


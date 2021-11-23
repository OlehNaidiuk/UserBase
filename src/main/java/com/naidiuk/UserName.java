package com.naidiuk;

import java.util.Random;

public class UserName {

    private static final String[] USER_NAMES = new String[]{"Stanislav", "Vladimir", "Vitaliy", "Dmitriy", "Oleh",
            "Anatoliy", "Igor", "Valeriy", "Aleksandr", "Evgeniy", "Sergey", "Artem", "Viktor",
            "Alena", "Aleksandra", "Natalia", "Anastasiya", "Fedor", "Olga", "Evgenia", "Lyudmila",
            "Tatyana", "Ksenia", "Yulia", "Valentina", "Svetlana", "Ekaterina", "Irina", "Veronika"};

    public static String getRandomName() {
        Random random = new Random();
        return USER_NAMES[(random.nextInt(USER_NAMES.length))];
    }
}


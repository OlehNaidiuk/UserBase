package com.naidiuk;

import java.util.ArrayList;
import java.util.Random;

public final class UserName {

    private static final String[] NAMES = new String[]{"Stanislav", "Vladimir", "Vitaliy", "Dmitriy", "Oleh",
            "Anatoliy", "Igor", "Valeriy", "Aleksandr", "Evgeniy", "Sergey", "Artem", "Viktor",
            "Alena", "Aleksandra", "Natalia", "Anastasiya", "Fedor", "Olga", "Evgenia", "Lyudmila",
            "Tatyana", "Ksenia", "Yulia", "Valentina", "Svetlana", "Ekaterina", "Irina", "Veronika"};
    private static final ArrayList<String> userNames = new ArrayList<>(NAMES.length);

    public String toString() {
        Random random = new Random();
        for (String name : NAMES) {
            userNames.add(name);
        }
        return userNames.get(random.nextInt(userNames.size()));
    }
}


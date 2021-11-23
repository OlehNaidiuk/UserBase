package com.naidiuk;

import java.util.Random;

public class RandomUserGenerator {

    private final String[] USER_NAMES = new String[]{"Stanislav", "Vladimir", "Vitaliy", "Dmitriy", "Oleh",
                        "Anatoliy", "Igor", "Valeriy", "Aleksandr", "Evgeniy", "Sergey", "Artem", "Viktor",
                        "Alena", "Aleksandra", "Natalia", "Anastasiya", "Fedor", "Olga", "Evgenia", "Lyudmila",
                        "Tatyana", "Ksenia", "Yulia", "Valentina", "Svetlana", "Ekaterina", "Irina", "Veronika"};

    public int getRandomId() {
        Random random = new Random();
        return random.nextInt(Integer.MAX_VALUE);
    }

    public String getRandomName() {
        Random random = new Random();
        return USER_NAMES[(random.nextInt(USER_NAMES.length))];
    }

    public int getRandomAge() {
        Random random = new Random();
        return (random.nextInt(101 - 7) + 7);
    }

    public Status getRandomStatus() {
        Random random = new Random();
        Status[] values = Status.values();
        return values[random.nextInt(2)];
    }
}


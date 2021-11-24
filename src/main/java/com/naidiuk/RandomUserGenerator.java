package com.naidiuk;

import java.util.Random;

public class RandomUserGenerator {

    private final String[] userNames = new String[]{"Stanislav", "Vladimir", "Vitaliy", "Dmitriy", "Oleh",
                        "Anatoliy", "Igor", "Valeriy", "Aleksandr", "Evgeniy", "Sergey", "Artem", "Viktor",
                        "Alena", "Aleksandra", "Natalia", "Anastasiya", "Fedor", "Olga", "Evgenia", "Lyudmila",
                        "Tatyana", "Ksenia", "Yulia", "Valentina", "Svetlana", "Ekaterina", "Irina", "Veronika"};
    private final Random random = new Random();

    public int getRandomId() {
        return random.nextInt(Integer.MAX_VALUE);
    }

    public String getRandomName() {
        return userNames[(random.nextInt(userNames.length))];
    }

    public int getRandomAge() {
        return (random.nextInt(101 - 7) + 7);
    }

    public Status getRandomStatus() {
        Status[] values = Status.values();
        return values[random.nextInt(2)];
    }
}


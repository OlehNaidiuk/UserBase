package com.naidiuk;

import java.util.Random;

public enum Status {
    ACTIVE,
    NOT_ACTIVE;

    public static Status getRandomStatus() {
        Random random = new Random();
        Status[] values = Status.values();
        return values[random.nextInt(2)];
    }
}

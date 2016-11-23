package com.mechanitis.demo.sense.client.mood;

import com.mechanitis.demo.sense.client.StubService;

import java.util.List;
import java.util.Random;

import static java.util.List.of;

public class MoodTestData {
    private static final List<String> POSSIBLE_MOODS
            = of("HAPPY", "SAD", "HAPPY,SAD");

    public static void main(String[] args) {
        new StubService("/moods/", 8082,
                        MoodTestData::getRandomMood).run();
    }

    private static String getRandomMood() {
        Random random = new Random();
        return POSSIBLE_MOODS.get(random.nextInt(3));
    }
}

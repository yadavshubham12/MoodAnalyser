package com.blz.moodAnalyze;

import org.testng.Assert;

public class MoodAnalyserTest {

    public static String analyseMood(String message) {
        if (message.contains("SAD")) {
            return "SAD";
        }
        else {
            return "HAPPY";
        }
    }

}

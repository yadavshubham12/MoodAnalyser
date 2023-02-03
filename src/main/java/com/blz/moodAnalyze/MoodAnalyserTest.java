package com.blz.moodAnalyze;

import org.testng.Assert;

public class MoodAnalyserTest {
        private String message;

        public MoodAnalyserTest() {
            this.message = "";
        }

        public MoodAnalyserTest(String message) {
            this.message = message;
        }

        public String analyseMood() throws IllegalArgumentException {
            if (this.message == null) {
                throw new IllegalArgumentException("Message cannot be null");
            }
            return "Sad";
        }
    }

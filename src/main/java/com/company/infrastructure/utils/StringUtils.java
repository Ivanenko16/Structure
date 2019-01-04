package com.company.infrastructure.utils;

public class StringUtils {
    public enum Mode {
        ALPHA, NUMERIC, ALPHANUMERIC
    }

    public static String randomString(Mode mode, int length) {
        String abc = "";

        switch (mode) {
            case ALPHA:
                abc = "abcdefghijklmnopqrstuvwxyz";
                break;
            case NUMERIC:
                abc = "0123456789";
                break;
            case ALPHANUMERIC:
                abc = "abcdefghijklmnopqrstuvwxyz0123456789";
                break;
        }

        String randomString = "";
        for (int i = 0; i < length; i++) {
            int randomIndex = (int) Math.random() * abc.length();
            randomString += abc.charAt(randomIndex);
        }
        return randomString;
    }
}

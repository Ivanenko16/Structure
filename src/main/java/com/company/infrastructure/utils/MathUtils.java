package com.company.infrastructure.utils;

public class MathUtils {

    public static int randomFromRange (int min, int max){
        if (min == max)
            return min;
        return min + (int)(Math.random()) * (max - min) + 1;
    }
}

package com.example.demo3;

import java.util.List;

public class Calculator {
    public int sum(int a) {
        if (a < 2 || a > 50) {
            return 0;
        }
        int sum = 0;
        for (int i = 2; i < a; i++) {
            if (i % 2 == 0 && i % 8 != 0) {
                sum += i;
            }
        }
        return sum;
    }

    public int sumarr(int[] arr) {
        if (arr == null) {
            throw new NullPointerException("Input array cannot be null");
        }
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
}





package com.example;

public class Statistics {

    public float average(int x1, int x2) {
        return (x1 + x2) / 2;
    }

    public float average(int x1, int x2, int x3) {
        return (x1 + x2 + x3) / 3;
    }

    public float average(int x1, int x2, int x3, int x4) {
        return (x1 + x2 + x3 + x4) / 4;
    }

    public float average(int... nums) {
        int sum = 0;
        for (int x : nums) {  // iterate int array nums
            sum += x;
        }
        return ((float) sum / nums.length);
    }
}

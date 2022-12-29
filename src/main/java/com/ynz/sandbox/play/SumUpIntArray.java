package com.ynz.sandbox.play;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Stream;

public class SumUpIntArray {
    private static int[] ints = new int[]{5, 8, 9, 10};

    public static void main(String[] args) {
        int sum1 = sumUpIntsByLoop(ints);
        int sum2 = sumUpIntsByStream(ints);
        System.out.println("are both sum equal? " + (sum1 == sum2));
    }

    private static int sumUpIntsByLoop(int[] ints) {
        Objects.requireNonNull(ints);
        int sum = 0;
        for (Integer integer : ints) {
            sum += integer;
        }
        return sum;
    }

    private static int sumUpIntsByStream(int[] ints) {
        Objects.requireNonNull(ints);
        return Arrays.stream(ints).sum();
    }
}

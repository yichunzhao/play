package com.ynz.sandbox.play.parallel;

import java.time.Duration;
import java.time.Instant;
import java.util.stream.IntStream;

public class UsingParallelStream {

    public static void main(String[] args) {

        var s1 = Instant.now();
        var r1 = IntStream.range(0, 1_000_000).parallel().sum();
        var e1 = Instant.now();


        var s2 = Instant.now();
        var r2 = IntStream.range(0, 1_000_000).sum();
        var e2 = Instant.now();

        var d1 = Duration.between(s1, e1).toMillis();
        var d2 = Duration.between(s2, e2).toMillis();

        System.out.println("parallel: " + d1 + " ms, result: " + r1);
        System.out.println("sequential: " + d2 + " ms, result: " + r2);
    }
}

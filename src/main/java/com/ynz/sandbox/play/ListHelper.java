package com.ynz.sandbox.play;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListHelper {

    static <T> Collection<List<T>> partition(List<T> list, int size) {
        if (list == null) throw new NullPointerException("list is null");
        if (size <= 0) throw new IllegalArgumentException("size is negative");

        //partition the given list into sub-lists of size n
        return list.stream().collect(Collectors.groupingBy(s -> (list.indexOf(s) / size))).values();
    }

    static <T> List<List<T>> partition2(List<T> list, int size) {
        if (list == null) throw new NullPointerException("list is null");
        if (size <= 0) throw new IllegalArgumentException("size is negative");

        //grouping the list into sub-lists of size n
        var collection =  IntStream.range(0, list.size())
                .boxed()
                .collect(Collectors.groupingBy(index -> index / size,
                        Collectors.mapping(list::get, Collectors.toList())))
                .values();

        return new ArrayList<>(collection);
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");

        // Example usage
        var numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        var chunkSize = 5;

        var partitionedLists = partition(numbers, chunkSize);

        var partitionedLists2 = partition2(numbers, chunkSize);

        // Printing the partitioned lists
        partitionedLists.forEach(System.out::println);
        partitionedLists2.forEach(System.out::println);
    }
}

package com.ynz.sandbox.play;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitStringByRegex {

    public static void main(String[] args) {
        String uri = "/patients?parameter=23";
        String[] strings = uri.split("\\?");
        Arrays.asList(strings).forEach(str -> System.out.println(str));

        List<Object> objectList = new ArrayList<>();
        objectList.add(null);
        objectList.add(null);
        System.out.println(objectList);
    }
}

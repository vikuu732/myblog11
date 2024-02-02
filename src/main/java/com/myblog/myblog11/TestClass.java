package com.myblog.myblog11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestClass {
    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(10,20,30,40,50,60,70,20,40,60);
        List<Integer> val = data.stream().distinct().collect(Collectors.toList());
        System.out.println(val);
    }

    }




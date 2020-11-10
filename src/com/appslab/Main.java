package com.appslab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 4, 5));
        if(arrayList.size() == 0)
        {
            System.out.println("List je prázdny");
        }
        else arrayList.forEach(System.out::println);
        
        List<Integer> numbers3 = arrayList.stream()
                .filter(num -> num % 2 != 0)
                .collect(Collectors.toList());

         List<Integer> numbers4 = arrayList.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(numbers3);
        System.out.println(numbers4);
    }
}

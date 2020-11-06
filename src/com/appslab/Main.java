package com.appslab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 4, 5));
        if(arrayList.size() == 0)
        {
            System.out.println("List je prázdny");
        }
        else arrayList.forEach(System.out::println);
    }
}

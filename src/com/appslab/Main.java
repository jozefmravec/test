package com.appslab;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        //1
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 4, 5));
        if(arrayList.size() == 0)
        {
            System.out.println("List je prázdny");
        }
        else arrayList.forEach(System.out::println);

        //3
        List<Integer> numbers3 = arrayList.stream()
                .filter(num -> num % 2 != 0)
                .collect(Collectors.toList());
        //4
         List<Integer> numbers4 = arrayList.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(numbers3);
        System.out.println(numbers4);


        //5
        List<Integer> listik = new ArrayList<>(Arrays.asList(2,3,1,0));
        listik.stream()
                .map(num -> num * listik.size())
                .forEach(System.out::println);



        //6
        List<Person> people = getPeople();
        Person person = new Person();
        int sorted = people.stream()
                .mapToInt(Person::getBalance)
                .sum();
        System.out.println(sorted);
        //7
        boolean nonematch = getPeople().stream()
                .anyMatch(a -> a.getName().contains("a"));
                System.out.println(nonematch);


    }
    private static List<Person> getPeople() {
        return List.of(
                new Person("John", 21, 23000),
                new Person ("Steve", 32, 40000),
                new Person ("Martin", 16, 2700)
        );


    }
}

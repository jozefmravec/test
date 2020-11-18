package com.appslab;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        //1
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 4, 5));
        if (arrayList.size() == 0) {
            System.out.println("List je prázdny");
        } else arrayList.forEach(System.out::println);


        //3
        List<Integer> numbers3 = arrayList.stream()
                .filter(num -> num % 2 != 0)
                .collect(Collectors.toList());
                System.out.println(numbers3);


        //4
        List<Integer> numbers4 = arrayList.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());
                System.out.println(numbers4);


        //5
        List<Integer> listik = new ArrayList<>(Arrays.asList(2, 3, 1, 0));
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
        boolean anymatch = getPeople().stream()
                .anyMatch(a -> a.getName().contains("a"));
        System.out.println(anymatch);


        //2
        List<Person> pepege = getPeople();
        if (pepege.contains(person))
        {
            System.out.println("Exist");
        }
        else
        {
            pepege.add(person);
        }


        //8
        HashSet<Integer> hs = new HashSet<Integer>(Arrays.asList(1, 1, 1, 2, 2, 3, 4, 5));
        if (hs.size() == 0) {
            System.out.println("List je prázdny");
        } else hs.forEach(System.out::println);


        //9
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Red", 1);
        map.put("Green", 2);
        map.put("Black", 3);
        map.put("White", 4);
        System.out.println(map);


        System.out.println(putIfAbsent());

    }
    public static List<Person> getPeople(){
            List<Person> myList = new ArrayList<>();
            myList.add(new Person("John", 21,500));
            myList.add(new Person("Steve", 32, 40000));
            myList.add(new Person("Martin", 16, 2700));
            return myList;




    }
    //10
    private static HashMap<String, Integer> putIfAbsent() {
        HashMap<String, Integer> mapStudent = new HashMap<>();
        mapStudent.put("Pep", 800);
        mapStudent.put("Nicolas",2000);
        mapStudent.put("Adam", 400);

        return mapStudent;
    }
}

package com.appslab;



public class Main {
    public static void main(String[] args) {

        Programmer programmer = new Programmer(1700, 200);
        Teacher teacher = new Teacher(900, 300);
        System.out.println(programmer.getInfo());
        System.out.println(teacher.getInfo());




    }
}

package com.appslab;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("John", 1234);
        Student student2 = new Student("Sam",123456 );
        System.out.println(student1.getName() + ": " + student1.getStudentNumber() + student2.getName() + " : " + student2.getStudentNumber());

        Person person1 = new Person("John", 21, 23000);
        Person person2 = new Person("Steve", 32, 40000);
        Person person3 = new Person("Martin", 16, 2700);

        System.out.println(equalSlices(11, 5, 2));
        System.out.println(Arrays.toString(multiplyByLength(new int[]{2, 3, 1, 0})));
        System.out.println(Numbers(1, 2 , 3));

        System.out.println(Summary(new Person[] {person1, person2, person3}));

        System.out.println(Function(3,4,3));

    }
    public static boolean equalSlices(int totalSlices, int numbersRecipients, int slicesEach) {

        if (numbersRecipients * slicesEach <= totalSlices) {
            return true;
        } else {
            return false;
        }
    }
    public static int[] multiplyByLength(int[] array){
        for (int i = 0; i < array.length; i++)
        {
            array[i] *= array.length;
        }
        return array;
    }
    public static boolean Numbers(int firstNumber, int secondNumber, int thirdNumber)
    {
        if(firstNumber + 1 == secondNumber  && thirdNumber - 1 == secondNumber)
        {
            return true;
        }
        else
        {
            return false;
        }

    }

    public static int Summary(Person[] person){
        int total = 0;
        for (int i = 0; i < person.length; i++)
        {

            total = total + person[i].getBalance();

        }
        return total;
    }
    public static int Function(int firstNumber, int secondNumber, int thirdNumber)
    {
        int equal = 0;
        if(firstNumber == secondNumber && secondNumber == thirdNumber)
        {
            equal = 3;
        }
        if(firstNumber == secondNumber && secondNumber != thirdNumber)
        {
            equal = 2;
        }
        if(firstNumber != secondNumber && secondNumber == thirdNumber)
        {
            equal = 2;
        }
        if (firstNumber != secondNumber && firstNumber == thirdNumber)
        {
            equal = 2;
        }
        if (firstNumber != secondNumber && secondNumber != thirdNumber)
        {
            equal = 0;
        }
        if(secondNumber == thirdNumber && secondNumber != firstNumber)
        {
            equal = 2;
        }
        if(thirdNumber == firstNumber && thirdNumber != secondNumber)
        {
            equal = 2;
        }
        return equal;

    }


}

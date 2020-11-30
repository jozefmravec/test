package com.appslab;


import com.appslab.model.Driver;
import com.appslab.model.Programmer;
import com.appslab.model.Teacher;
import com.appslab.model.Work;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Programmer programmer = new Programmer(1700, 200);
        Teacher teacher = new Teacher(900, 300);
        Driver driver = new Driver(1100,100);
        EmployeeService employeeService= new EmployeeServicempl();

        List<Work> Listik = List.of(programmer, teacher, driver);
        Listik.forEach(a -> System.out.println(a.getInfo()));

        System.out.println(employeeService.bonusNum(Listik));
        System.out.println(employeeService.salaryNum(Listik));












    }
}

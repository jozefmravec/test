package com.appslab;

public class Work {
    float salary;
    int bonus;
    Employment emp;
    public Work(float salary, int bonus, Employment emp) {
        this.salary = salary;
        this.bonus = bonus;
        this.emp = emp;
    }
    public String getInfo()
    {
        return emp.Empoyment + "´s salary is " + salary + " and bonus is " + bonus;
    }

}

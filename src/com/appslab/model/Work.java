package com.appslab.model;

import com.appslab.model.Employment;

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
        int total = (int) (salary + bonus);
        if (emp == Employment.PROGRAMMER)
        {
            return emp.Empoyment + "´s salary is " + total;
        }
        else {
            return emp.Empoyment + "´s salary is " + salary + " and bonus is " + bonus;
        }
    }
    public float getSalary()
    {
        return salary;
    }
    public int getBonus()
    {
        return bonus;
    }

}

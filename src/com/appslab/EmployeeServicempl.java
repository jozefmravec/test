package com.appslab;

import com.appslab.model.Work;

import java.util.List;

public class EmployeeServicempl implements EmployeeService {

    @Override
    public float salaryNum(List<Work> list)
    {
       return (float) list.stream()
                .mapToDouble(Work::getSalary).sum();



    }

    @Override
    public int bonusNum(List<Work> list) {
        return list.stream()
                .mapToInt(Work::getBonus).sum();
    }
}

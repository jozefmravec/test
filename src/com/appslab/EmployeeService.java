package com.appslab;

import com.appslab.model.Work;

import java.util.List;
import java.util.stream.IntStream;

public interface EmployeeService {
    float salaryNum(List<Work> list);
    int bonusNum(List<Work> list);
}

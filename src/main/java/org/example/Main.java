package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(2,2000));
        employees.add(new Employee(1,3000));
        employees.add(new Employee(3,4000));
        employees.add(new Employee(4,5000));
        employees.add(new Employee(5,1000));
        employees.add(new Employee(6,1200));
        employees.add(new Employee(7,2200));

        List<Employee> em = employees.stream().sorted((e1, e2)-> (int) (e2.getSalary()-e1.getSalary()))
                .skip(3)
                .collect(Collectors.toList());
        System.out.println(em);

        //        for (Employee emp: em){
//            System.out.println(emp.getSalary());
//        }
    }
}
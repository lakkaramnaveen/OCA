package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
//        Employee e1 = new Employee(1, 29, "nani", new Address("Street1", 456), 12000);
//        Employee e2 = new Employee(2, 22, "chini", new Address("Stree2", 232), 12222);
//        Employee e3 = new Employee(3, 21, "potti", new Address("Mam", 324), 12121);
//        Employee e4 = new Employee(4, 20, "min", new Address("Street4", 333), 10000);
//        Employee e5 = new Employee(5, 21, "chin", new Address("Street3", 334), 11000);
//
//        List<Employee> employeeList = new ArrayList<>();
//        employeeList.add(e1);
//        employeeList.add(e2);
//        employeeList.add(e3);
//        employeeList.add(e4);
//        employeeList.add(e5);
//
//        System.out.println(" Unsorted List "+employeeList);
//
//        Collections.sort(employeeList, new AgeComparator());
//        System.out.println(" Sorted list based on age "+employeeList);
//        String[] s = {"1","2","3","4"};
//        asa(s);
//        as(s);

        Predicate<String> p = s1 -> s1.length() > 5;
        System.out.println(p.test("code dfecode"));
    }

    public static void asa(String[] main) {
        for (int i = 1; i < main.length && i < 6; i = i + 2)
            System.out.println(main[i]);
    }


    public static void as(String... arguments) {
        int ctr = 0;
        while (ctr < arguments.length) {
            if (ctr >= 4) break;
            if (ctr %2 != 0)
                System.out.println(arguments[ctr]);
            ++ctr;
        }
    }



}


class JavaCertQType6 {
    public static void main(String... method) {
        main();
        //main(method);
        }
        public static void main() {
        System.out.println("EJavaGuru");
        }
}
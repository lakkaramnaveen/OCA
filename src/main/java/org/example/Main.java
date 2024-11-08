package org.example;

public class Main {
        public static void main(String[] args) {
            Emp emp1 = new Emp();
            Emp emp2 = new Emp();
            emp1.bankVault = 10;
            System.out.println(Emp.getBankVault());
        }
}
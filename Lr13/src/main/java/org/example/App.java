package org.example;


public class App {
    public static void main(String[] args) {
        try {
            Employee e1 = new Employee("Ян", "Junior", 1000, "IT");
            Employee e2 = new Employee("Ева", "HR", 800, "HR");
            System.out.println("Было: " + e1);
            System.out.println("Было: " + e2);
            e1.promote("Middle");
            System.out.println("После повышения: " + e1);
            e2.changeDepartment("Marketing");
            System.out.println("После перевода: " + e2);
            e2.changeDepartment("TestDep");
        } catch (Exception e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}

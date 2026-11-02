package org.example;

public class Employee {
    private String fullName;
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    private String position;
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    private double salary;
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        totalSalary = totalSalary - this.salary + salary;
        this.salary = salary;
    }
    private static int totalEmployees = 0;
    public static int getTotalEmployees() {
        return totalEmployees;
    }
    public static void setTotalEmployees(int totalEmployees) {
        Employee.totalEmployees = totalEmployees;
    }

    private static double totalSalary = 0;
    public static double getTotalSalary() {
        return totalSalary;
    }
    public static void setTotalSalary(double totalSalary) {
        Employee.totalSalary = totalSalary;
    }

    public Employee(String fullName, String position, double salary) {
        this.fullName = fullName;
        this.position = position;
        this.salary = salary;
        totalEmployees++;
        totalSalary += salary;
    }

    public static double getAverageSalary() {
        if (totalEmployees == 0) {
            return 0;
        }
        return totalSalary / totalEmployees;
    }

    public static void print(Employee employee){
        System.out.println("ФИО:"+employee.getFullName()+" Позиция: "+employee.getPosition()+" Зарплата: "+ employee.getSalary()+" Всего сотрудников: "+Employee.getTotalEmployees()+" Средняя ЗП: "+Employee.getAverageSalary());
    }

}

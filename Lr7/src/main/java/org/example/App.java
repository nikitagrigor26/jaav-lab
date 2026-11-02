package org.example;


public class App {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Григорьев Н.С", "Разработчик", 1500.0);
        Employee emp2 = new Employee("Шемет Э.С", "Тестировщик", 1200.0);
        Employee emp3 = new Employee("Яцына И.С", "Тимлид", 3000.0);
        Employee emp4 = new Employee("Савко М.Д", "HR-менеджер", 1000.0);
        Employee emp5 = new Employee("Руденя И.А", "Уборщик", 1400.0);

        System.out.println("Всего сотрудников: " + Employee.getTotalEmployees());
        System.out.printf("Средняя зарплата сотрудников: %.2f%n", Employee.getAverageSalary());
        Employee.print(emp1);
    }
}

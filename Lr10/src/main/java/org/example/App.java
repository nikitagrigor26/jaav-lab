package org.example;

public class App {
    public static void main(String[] args) {
        Manager mgr1 = new Manager("Алексей", 5000.00, "Project Manager", 5);
        Manager mgr2 = new Manager("Елена", 6000.00, "Product Owner", 8);
        Developer dev1 = new Developer("Иван", 2500.00, "Junior Developer", "Java");
        Developer dev2 = new Developer("Ольга", 3500.00, "Middle Developer", "Python");
        Developer dev3 = new Developer("Петр", 4000.00, "Middle Developer", "C++");
        System.out.println("Все работники:");
        mgr1.work();
        mgr2.work();
        dev1.work();
        dev2.work();
        dev3.work();
        System.out.println("Повышение");
        mgr1.promote();
        dev1.promote();
        dev3.promote();

    }
}

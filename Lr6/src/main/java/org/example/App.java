package org.example;


public class App {
    public static void main(String[] args) {
        Building myBuilding = new Building("ул.Щорса, 4А", 12, 2500.50);
        System.out.println("Адрес здания: " + myBuilding.getAddress());
        System.out.println("Количество этажей: " + myBuilding.getFloors());
        System.out.println("Общая площадь: " + myBuilding.getTotalArea());
        System.out.printf("Средняя площадь одного этажа: %.2f кв.м.%n", myBuilding.averageAreaPerFloor());

        Building newBuild = new Building("ул.Слободская 15",9,2600.00,2);
    }
}

package org.example;


import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<String,Shape> maps = new LinkedHashMap<>();
        maps.put("Круг маленький",new Circle(2.3));
        maps.put("Круг средний",new Circle(5.0));
        maps.put("Круг большой", new Circle(10.0));
        maps.put("Прямоугольник маленький", new Rectangle(2.0,3.0));
        maps.put("Прямоугольник средний", new Rectangle(4.0,6.0));
        maps.put("Прямоугольник большой", new Rectangle(2.0,3.0));
        maps.put("Треугольник маленький", new Triangle(2.0,3.0));
        maps.put("Треугольник равнобедренный", new Triangle(3.0,3.0));
        System.out.println("Вывод всех элементов");
        for (Map.Entry<String, Shape> entry : maps.entrySet()) {
            String key = entry.getKey();
            Shape value = entry.getValue();
            System.out.println("Ключ: " + key + "-"  + value);
        }
        System.out.println("Второй способ");
        maps.forEach((key, value) -> System.out.println("Ключ: " + key + "-" + value));
    }
}

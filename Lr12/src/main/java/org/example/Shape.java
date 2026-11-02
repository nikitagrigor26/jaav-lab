package org.example;

public class Shape {
    private String name;
    private int id;
    protected double area;

    private static int idCounter = 0;

    public String getName(){
        return name;
    }

    public void setName(String value) {
        if (value == null || value.trim().isEmpty()) {
            System.out.println("Название не может быть пустым");
            return;
        }
        this.name = value; }

    public int getId(){
        return id;
    }

    public double getArea(){
        return area;
    }

    public void setArea(double area){
        if(area < 0){
            System.out.println("Площадь не может быть меньше 0");
            return;
        }
        this.area = area;
    }

    public Shape(String name, double area){
        setName(name);
        setArea(area);
        idCounter++;
        this.id = idCounter;
    }

    @Override
    public String toString() {
        return "Имя: "+name+ "Id: "+id +"Площадь "+area;
    }
}

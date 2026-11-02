package org.example;

public class Developer implements Workable,Promotable{
    String name;
    public String getName(){
        return name;
    }
    public void setName(String value){
        if(value==""){
            System.out.println("Имя не может быть пустым");
            return;
        }
        name=value;
    }

    double salary;
    @Override
    public double getSalary(){
        return salary;
    }
    public void setSalary(double value){
        if(value<0){
            System.out.println("Зарплата не может быть отрицательной");
            return;
        }
        salary=value;
    }

    String position;
    @Override
    public String getPosition(){
        return position;
    }
    public void setPosition(String value){
        if(value==""){
            System.out.println("Ошибка, позиция должна быть обязательно");
            return;
        }
        position=value;
    }
    String language;
    public String getLanguage(){
        return language;
    }
    public void setLanguage(String value){
        if(value==""){
            System.out.println("Ошибка, у разработчика должно быть заполнено");
            return;
        }
        language=value;
    }
    public Developer(String name,double salary,String position,String language){
        setName(name);
        setSalary(salary);
        setPosition(position);
        setLanguage(language);
    }
    @Override
    public void promote() {
        this.salary += 1000.00;
        this.position = "Senior " + this.position;
        System.out.println("Разработчик " + name + " повышен!. Его зп "+salary);
    }

    @Override
    public void work() {
        System.out.println("Разработчик " + name + " пишет код на " + language + ". Его зп "+salary);
    }

}

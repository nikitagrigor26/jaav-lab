package org.example;

public class Manager implements Workable,Promotable{
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

    int teamSize;
    public int getTeamSize(){
        return teamSize;
    }
    public void setTeamSize(int value){
        if(value<0){
            System.out.println("Размер команды не может быть отрицательным");
            return;
        }
        teamSize=value;
    }
    public Manager(String name,double salary,String position,int teamSize){
        setName(name);
        setSalary(salary);
        setPosition(position);
        setTeamSize(teamSize);
    }
    @Override
    public void work() {
        System.out.println("Менеджер " + name + " управляет командой из " + teamSize + " человек.");
    }
    @Override
    public void promote() {
        this.salary += 1500.00;
        this.position = "Senior " + this.position;
        this.teamSize += 2;
        System.out.println("Менеджер " + name + " повышен до " + position + "! Новая зарплата: " + salary);
    }





}

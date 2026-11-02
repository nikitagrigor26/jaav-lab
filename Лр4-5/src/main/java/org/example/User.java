package org.example;

public class User {
    String name;
    Role role;
    public User(String name,Role role){
        this.name=name;
        this.role=role;
    }
    @Override
    public String toString(){
        return "Имя: "+this.name+"роль: "+this.role;
    }
}

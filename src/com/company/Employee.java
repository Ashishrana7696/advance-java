package com.company;

import java.io.Serializable;

public class Employee implements Serializable{

        String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    int id;

    String  password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

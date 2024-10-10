package com.deepblue;

import lombok.Data;

@Data
public class Person {

    private String name;
    private int age;
    private String address;
    public Person(String name, int age, String address) {
        super();
        this.name = name;
        this.age = age;
        this.address = address;
    }

}

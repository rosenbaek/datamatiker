package com.company;
public class Objects {

    private String name;
    public int age;

    public Objects(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Objects{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

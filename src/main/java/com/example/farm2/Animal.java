package com.example.farm2;

public class Animal {
private String name;
private double weight;
private double height;
private float age;

    public Animal(String name, double weight, double height, float age) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public String printAnimal(){
        return this.name +" " + this.age+" "+this.height+" "+this.weight;
    }
}

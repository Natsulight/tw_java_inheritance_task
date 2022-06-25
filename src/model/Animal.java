package model;

public class Animal {

    private int age;

    private double weight;

    public Animal() {
    }

    public Animal(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }

    public void running() {
        System.out.println("Animal running");
    }

    public void eating() {
        System.out.println("Animal eating");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


}

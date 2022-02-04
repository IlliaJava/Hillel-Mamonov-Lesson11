package com.hillel.lesson11.task1;
// Task 1. Person list
/*1. Создать класс Person который описывает человека, с полями: имя, фамилия, возраст, вес, рост.
        Создать один или несколько конструкторов которые гарантирует что у каждого есть имя и фамилия.
        Создать список из 100 обьектов типа Person заполненных случайными данными (Например создать массив на несколько имен и выбирать из него случайным образом).
        Код который создает список Person и заполняет его данными разместить в другом классе, не в Person, например в PersonFactory.
        Обеспечить чтобы случайные данные (вес, рост, возраст) выглядели правдоподобно:
        не было человека весом 3 кг и ростом 180 итд.*/

public class Person {
    private final String firstName;
    private final String familyName;
    private final int age;
    private final int height;
    private final int weight;

    public Person(String firstName, String familyName, int age, int height, int weight) {
        this.firstName = firstName;
        this.familyName = familyName;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "\nPerson{" + "firstName='" + firstName + '\'' + ", familyName='" + familyName + '\'' + ", age=" + age + ", height=" + height + ", weight=" + weight + "}";
    }
}

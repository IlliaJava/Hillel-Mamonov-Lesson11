package com.hillel.lesson11.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personsList = new ArrayList<>();
        PersonFactory.generatePersonsList(personsList,10000);
        System.out.println(personsList);
        System.out.println("\nЧисло людей в списке = " + personsList.size());
    }
}

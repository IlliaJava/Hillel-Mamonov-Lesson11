package com.hillel.lesson11.task1;

import static com.hillel.lesson11.task1.PersonFactory.familyNamesList.generatePersonsList;
import static com.hillel.lesson11.task1.PersonFactory.familyNamesList.personsList;

public class Main {
    public static void main(String[] args) {

        generatePersonsList();

        System.out.println(personsList);
        System.out.println("\nКоличество людей в списке: " + personsList.size() + " человек.");
    }
}

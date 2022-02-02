package com.hillel.lesson11.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PersonFactory {

    static Random random = new Random();

    /**
     * weightIndex variable - is based on "Body mass index" values,
     * but only uses "realistic" groups, in range 19..30,
     * means not too big underweight and not overweight.
     */
    public static double weightIndex = (random.nextInt(190) + 110) / 10.0;

    /**
     * Random age in rage of 18..90 years
     *
     * @return int age
     */
    public static int randomAge() {
        return random.nextInt(72) + 18;
    }

    /**
     * Random height in rage of 140..210 sm
     *
     * @return int height in "sm"
     */
    public static int randomHeight() {
        return (random.nextInt(70) + 140);
    }

    public enum firstNamesList {
        John, Anna, Tom, Maria, Daniel, Natalia, Simon, Rachel, Ivan, Anastasia, Alex, Peter, Elizabeth;

        public static firstNamesList randomName() {
            firstNamesList[] names = firstNamesList.values();
            return names[new Random().nextInt(names.length)];
        }
    }

    public enum familyNamesList {
        Jones, Smith, Middleton, Brown, Garcia, Lopez, Miller, Wilson, Davis, Lee, White, Kind, Wright, Adams, Diaz;

        public static familyNamesList randomFamilyName() {
            familyNamesList[] familyNames = familyNamesList.values();
            return familyNames[new Random().nextInt(familyNames.length)];
        }

        public static final List<Person> personsList = new ArrayList<>();

        public void add(Person person) {
            personsList.add(person);
        }

        public static void generatePersonsList() {
            for (int i = 1; i <= 100; i++) {
                personsList.add(new Person());
            }

        }
    }

}

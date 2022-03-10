package main;

import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person [] personsArray = {new Person("bob"), new Person("joe"), new Person("will")};

        for (int i = 0; i < personsArray.length; i++) {
            System.out.print(personsArray[i].getName()+ " ");
        }
        System.out.println();

        Person [] addedPersonsArray = addPerson(personsArray, new Person("sally"));

        for (int i = 0; i < addedPersonsArray.length; i++) {
            System.out.print(addedPersonsArray[i].getName() + " ");
        }
    }

    public static Person [] addPerson(Person [] personArray, Person  person) {

        Person [] newArray = new Person[personArray.length + 1];

        for (int i = 0; i < newArray.length; i++) {

            if (i == newArray.length - 1){
                newArray[i] = person;
                continue;
            }
            newArray[i] = personArray[i];
        }
        return newArray;
    }
}

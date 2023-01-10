import java.util.Arrays;

public class ArraysExercise {
    public static Person[] addPerson(Person[] people, Person newPerson) {
        Person[] newPeopleArray = new Person[people.length + 1];

        for (int i = 0; i < people.length; i++) {
            newPeopleArray[i] = people[i];
        }
        newPeopleArray[newPeopleArray.length - 1] = newPerson;
        return newPeopleArray;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));

        Person[] people = {new Person("John"), new Person("Jeff"), new Person("Bob")};

        for (Person person : people) {
            System.out.println(person.getName());
        }

        System.out.println(Arrays.toString(people));
        people = addPerson(people, new Person("Jane"));
        for (Person person : people) {
            System.out.println(person.getName());
        }
    }
}

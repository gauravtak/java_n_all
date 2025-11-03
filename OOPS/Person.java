package OOPS;

import java.util.ArrayList;
import java.util.Scanner;

public class Person {

    private String name;
    private int age;
    private int height;

    public Person(String n, int a) {
        this.name = n;
        this.age = a;
    }

    public String toString() {
        return "Meet " + this.name + " who is " + this.age + " years old and " + this.height + " feet tall";
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<Person>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter name  and age of a person: e.g. Sunil,20");
            String details = scanner.nextLine();

            if (details.isEmpty()) {
                break;
            }

            String[] parts = details.split(",");

            String name = parts[0];
            int age = Integer.valueOf(parts[1]);

            persons.add(new Person(name, age));
        }

        scanner.close();

        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
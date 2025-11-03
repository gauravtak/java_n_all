package MoocJava;

import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths;

class Person {
    String name;
    int age;

    Person(String n, int a) {
        this.name = n;
        this.age = a;
    }

    public String toString() {
        return this.name + ", " + this.age;
    }
}

public class StoringRecords {

    public static ArrayList<Person> readRecordsFromFile(String file) {
        Path filePath = Paths.get(file);
        ArrayList<Person> persons = new ArrayList<Person>();

        try (Scanner scanner = new Scanner(filePath)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] parts = line.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);

                persons.add(new Person(name, age));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        return persons;
    }

    public static void main(String[] args) {
        ArrayList<Person> res = readRecordsFromFile("data.txt");
        for (Person person : res) {
            System.out.println(person);
        }
    }

}
package MoocJava;

import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths;

public class File {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Specify which file content should I print: ");
        String fileName = scanner.nextLine();
        Path filePath = Paths.get(fileName);
        try {
            scanner = new Scanner(filePath);
            int count = 0;
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                if (row.isEmpty()) {
                    continue;
                }
                count++;
                System.out.println(row);
            }
            System.out.println("Total number of lines in this file: " + count);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

    }

}

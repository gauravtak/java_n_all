package MoocJava;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Games {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File: ");
        String file = scanner.nextLine();

        System.out.println("Team: ");
        String teamName = scanner.nextLine();

        Path filepath = Paths.get(file);
        int count = 0;
        int winCount = 0;
        try {
            scanner = new Scanner(filepath);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }

                String[] parts = line.split(",");
                if (teamName.equals(parts[0]) || teamName.equals(parts[1])) {
                    count++;
                }

                if (teamName.equals(parts[0]) && Integer.valueOf(parts[2]) > Integer.valueOf(parts[3])) {
                    winCount++;
                }

                if (teamName.equals(parts[1]) && Integer.valueOf(parts[3]) > Integer.valueOf(parts[2])) {
                    winCount++;
                }

            }

            System.out.println("Games: " + count);
            System.out.println("Win: " + winCount);
            System.out.println("Loss: " + (count - winCount));
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

    }

}

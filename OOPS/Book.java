package OOPS;

import java.util.ArrayList;
import java.util.Scanner;

public class Book {

    String title;
    int pages;
    int pubYear;

    Book(String title, int pages, int pubYear) {
        this.title = title;
        this.pages = pages;
        this.pubYear = pubYear;
    }

    public String toString() {
        return this.title + "," + this.pages + "," + this.pubYear;
    }

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Title: ");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.println("Publication Year: ");
            int pubYear = Integer.valueOf(scanner.nextLine());

            books.add(new Book(title, pages, pubYear));

        }

        System.out.println("What information will be printed? ");
        String infoToBePrinted = scanner.nextLine();

        switch (infoToBePrinted) {
            case "everything":
                for (Book book : books) {
                    System.out.println(book);
                }
                break;
            case "title":
                for (Book book : books) {
                    System.out.println(book.title);
                }
                break;
            case "pages":
                for (Book book : books) {
                    System.out.println(book.pages);
                }
                break;
            case "pubYear":
                for (Book book : books) {
                    System.out.println(book.pubYear);
                }
                break;
        }

        scanner.close();

    }
}
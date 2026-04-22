package com.pluralsight;

import java.util.Scanner;

public class LibraryApp {
    private static Book[] books = new Book[20];

    public static void main(String[] args) {

        books[0] = new Book(1, "100-0000000001", "Book 1", false, "");
        books[1] = new Book(2, "100-0000000002", "Book 2", false, "");
        books[2] = new Book(3, "100-0000000003", "Book 3", false, "");
        books[3] = new Book(4, "100-0000000004", "Book 4", false, "");
        books[4] = new Book(5, "100-0000000005", "Book 5", false, "");
        books[5] = new Book(6, "100-0000000006", "Book 6", false, "");
        books[6] = new Book(7, "100-0000000007", "Book 7", false, "");
        books[7] = new Book(8, "100-0000000008", "Book 8", false, "");
        books[8] = new Book(9, "100-0000000009", "Book 9", false, "");
        books[9] = new Book(10, "100-0000000010", "Book 10", false, "");
        books[10] = new Book(11, "100-0000000011", "Book 11", false, "");
        books[11] = new Book(12, "100-0000000012", "Book 12", false, "");
        books[12] = new Book(13, "100-0000000013", "Book 13", false, "");
        books[13] = new Book(14, "100-0000000014", "Book 14", false, "");
        books[14] = new Book(15, "100-0000000015", "Book 15", false, "");
        books[15] = new Book(16, "100-0000000016", "Book 16", false, "");
        books[16] = new Book(17, "100-0000000017", "Book 17", false, "");
        books[17] = new Book(18, "100-0000000018", "Book 18", false, "");
        books[18] = new Book(19, "100-0000000019", "Book 19", false, "");
        books[19] = new Book(20, "100-0000000020", "Book 20", false, "");

        //Scanner
        Scanner scanner = new Scanner(System.in);
        //While Loop for Application prompts
        boolean isDone = false;

        while (!isDone) {
            System.out.println("Welcome to the Neighborhood Library!\n");
            System.out.println("===========================");
            System.out.println("1 - Show Available Books");
            System.out.println("2 - Show Checked Out Books");
            System.out.println("0 - Exit Application");
            System.out.println("===========================\n");
            System.out.print("Enter your choice: ");

            int command = scanner.nextInt();
            //to consume character left in scanner buffer
            scanner.nextLine();

            switch (command) {
                case 1:
                    for (Book book: books)
                        if (!book.isCheckedOut()) {
                            System.out.printf("ID: %d | ISBN: %s | Title: %s%n",
                                    book.getId(), book.getIsbn(), book.getTitle());
                        }
                    System.out.print("Would you like to select a book or return to home?(C/X): ");
                    String action = scanner.nextLine().toUpperCase();
                    if (action.equals("C")){
                        System.out.print("Please enter the ID of the book you want: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter your name: ");
                        String name = scanner.nextLine();
                        for (Book book : books){
                            if (book != null && book.getId() == id){
                                book.checkOut(name);
                                System.out.println("Book checked out!");
                            }
                        }
                    }else {}
                    break;
                case 2:

                    break;
                case 0:
                    isDone = true;
                    System.out.println("Goodbye!");
                default:
                    System.out.println("\nInvalid input please try again.\n");

            }


        }
    }
}

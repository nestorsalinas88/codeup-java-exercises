package bookstore;

import util.Input;

import java.util.Arrays;

public class BookStore {


    static Input input =  new Input();
    //       - Make a class called BookStore.java that has your main method and the code that runs.
public static Book[] bookArray= Arrays.copyOf(BookInventory.findAll(), BookInventory.findAll().length);

    public static String getAuthor(){
        String author = "unassigned";
        int authorSelected = input.getInt(1, 6, "Enter the category:\n1 - yolo\n2 - drama\n3 - horror\n4 - scifi\n5 - musical\n6 - comedy");
        switch(authorSelected){
            case 1:
                author = "yolo";
                break;
            case 2:
                author = "drama";
                break;
            case 3:
                author = "horror";
                break;
            case 4:
                author = "scifi";
                break;
            case 5:
                author = "musical";
                break;
            case 6:
                author = "comedy";
                break;
        }
        return author;
    }

    public static void displayBook(Book book) {
        System.out.print(book);
    }
    public static void displayBook () {
        for(Book book : bookArray) {
            System.out.print(book);
        }
    }
    public static void displayBook (String author) {
        for(Book book : bookArray) {
            if(book.getAuthor().equals(author)) {
                System.out.print(book);
            }
        }
    }
    public static void main(String[] args) {
        int choice;
        do {
            Arrays.sort(bookArray, Book.BookNameComparator);
            System.out.println("\nWelcome to The Store Hub!\n");
            System.out.println("\nWhat would you like to do?\n");
            System.out.println(" ============================= ");
            System.out.printf("| 0 - %-23s |\n", "exit");
            System.out.printf("| 1 - %-23s |\n", "view all books");
            System.out.printf("| 2 - %-23s |\n", "view all yolo");
            System.out.printf("| 3 - %-23s |\n", "view all drama");
            System.out.printf("| 4 - %-23s |\n", "view all horror");
            System.out.printf("| 5 - %-23s |\n", "view all scifi");
            System.out.printf("| 6 - %-23s |\n", "view all musical");
            System.out.printf("| 7 - %-23s |\n", "view all comedy");
            System.out.printf("| 8 - %-23s |\n", "search books by title");
            System.out.printf("| 9 - %-23s |\n", "modify existing books");
            System.out.printf("| 10 - %-23s|\n", "add a new book");
            System.out.println(" ============================= ");
            choice = input.getInt(0, 10, "\nEnter your choice: ");
            System.out.println(" ------------------------------------------------------");
            switch(choice){
                case 1:
                    displayBook();
                    break;
                case 2:
                    displayBook("yolo");
                    break;
                case 3:
                    displayBook("drama");
                    break;
                case 4:
                    displayBook("horror");
                    break;
                case 5:
                    displayBook("scifi");
                    break;
                case 6:
                    displayBook("musical");
                    break;
                case 7:
                    displayBook("comedy");
                    break;

                default:
                    System.out.printf("%29s\n", "Adios");
            }
            System.out.println(" ------------------------------------------------------");
        } while(choice != 0);
    }
}

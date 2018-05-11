package bookstore;


import movies.Movie;

public class BookStoreApp extends Product{

    public BookStoreApp(String type, double price) {
        super(type, price);
    }
    //       - Make a class called BookStoreApp.java that has your main method and the code that runs.

    public static void main(String[] args) {
        int choice;
        do {

            System.out.println("\nWelcome to The Store Hub!\n");
            System.out.println("\nWhat can we do for you?\n");
            System.out.println(" ============================= ");
            System.out.printf("| 0 - %-23s |\n", "exit");
            System.out.printf("| 1 - %-23s |\n", "view all products");
            System.out.printf("| 2 - %-23s |\n", "view all book products");
            System.out.printf("| 3 - %-23s |\n", "view all movie products");
            System.out.printf("| 4 - %-23s |\n", "view all snack products");
            System.out.printf("| 5 - %-23s |\n", "view all scifi");
            System.out.printf("| 6 - %-23s |\n", "view all musical");
            System.out.printf("| 7 - %-23s |\n", "view all comedy");
            System.out.printf("| 8 - %-23s |\n", "search books by title");
            System.out.printf("| 9 - %-23s |\n", "modify existing books");
            System.out.printf("| 10 - %-23s|\n", "add a new book");
            System.out.println(" ============================= ");
            choice = input.getInt(0, 7, "\nEnter your choice: ");
            System.out.println(" ------------------------------------------------------");
            switch(choice){
                case 1:
                    displayProduct();
                    break;
                case 2:
                    displayProduct("Book");
                    break;
                case 3:
                    displayProduct("Movie");
                    break;
                case 4:
                    displayProduct("horror");
                    break;
                case 5:
                    displayProduct("scifi");
                    break;
                case 6:
                    displayProduct("musical");
                    break;
                case 7:
                    displayProduct("comedy");
                    break;

                default:
                    System.out.printf("%29s\n", "Adios");
            }
            System.out.println(" ------------------------------------------------------");
        } while(choice != 0);
    }
}

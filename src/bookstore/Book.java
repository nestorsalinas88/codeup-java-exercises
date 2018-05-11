package bookstore;

import java.util.Comparator;

public class Book extends Product implements Cart {

    //       - Create a Book class that inherits from product and ads an author property


    //       - Book class’s author property should hold an Cart typed object

    protected String title;
    protected String Author;
    protected double pages;

    public Book(String type, double price, String title, String author, double pages) {
        super(type, price);
        this.title = title;
        Author = author;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return String.format("| %-10s | %-8s | %-35s | %12s |\n", type, price, title, pages);
    }

    @Override
    public boolean confirmProductSelection() {
        return false;
    }

    @Override
    public int addToCart() {
        return 0;
    }


//        public int compare(Book o1, Book o2) {
//            String bookTitle = o1.fullName().replaceAll("^(?i)The ", "").toLowerCase();
//            String bookTitle2 = o2.fullName().replaceAll("^(?i)The", "").toLowerCase();
//            return bookTitle.compareTo(bookTitle2);
//
//        }
//    };

}

package bookstore;

import util.Input;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public abstract class Product {
    public static Product[] findAll() {
        return new Product[]{
                new Book("Book",3,"Title", "names", 45),
                new Book("Book", 3,"Casablanca", "bleh", 6),
                new Book("Book", 3,"The Godfather","drama",4),
                new Book("Book", 3,"Gone With The Wind", "drama", 4),
                new Book("Book", 3,"Lawrence Of Arabia", "drama", 4),
                new Book("Book", 3,"The Wizard Of Oz", "musical", 4),
                new Book("Book", 3,"The Graduate", "drama", 4),
                new Book("Book", 3,"On The Waterfront", "drama", 4),
                new Book("Book", 3,"Schindler's List", "drama", 4),
                new Book("Book", 3,"Singin' In The Rain", "musical", 4),
                new Book("Book", 3,"It's A Wonderful Life", "drama", 4),
                new Book("Book", 3,"Sunset Boulevard", "drama", 4),
                new Book("Book", 3,"The Bridge On The River Kwai", "drama", 4),
                new Book("Book", 3,"Some Like It Hot", "drama", 4),
                new Book("Book", 3,"Star Wars", "scifi",4),
                new Book("Book", 3,"All About Eve", "drama",4),
                new Book("Book", 3,"The African Queen", "drama",4),
                new Book("Book", 3,"Psycho", "horror",6),
                new Book("Book", 3,"Chinatown", "drama",6),
                new Book("Book", 3,"One Flew Over The Cuckoo's Nest", "drama",5),
                new Book("Book", 3,"The Grapes Of Wrath", "drama",5),
                new Book("Book", 3,"2001: A Space Odyssey", "scifi",5),
                new Book("Book", 3,"The Maltese Falcon", "drama",5),
                new Book("Book", 3,"Raging Bull", "drama",5),
                new Book("Book", 3,"E.T. The extra-terrestrial", "scifi",5),
                new Book("Book", 3,"Dr. Strangelove", "drama",5),
                new Book("Book", 3,"Bonnie And Clyde", "drama",5),
                new Book("Book", 3,"Apocalypse Now", "drama",5),
                new Book("Book", 3,"Mr. Smith Goes to Washington", "drama",5),
                new Book("Book", 3,"The Treasure Of The Sierra Madre", "drama",5),
                new Book("Book",4,"Yankee Doodle Dandy", "musical", 5),
                new Movie("Movie", 5,"Steven Spielberg","kung fu",1993),
                new Movie("Movie", 5,"Steven Spielberg","kung fu",1993),
                new Movie("Movie", 5,"Steven Spielberg","kung fu",1993),
                new Movie("Movie", 5,"Steven Spielberg","kung fu",1993),
                new Movie("Movie", 5,"Steven Spielberg","kung fu",1993),
                new Movie("Movie", 5,"Steven Spielberg","kung fu",1993),
                new Movie("Movie", 5,"Steven Spielberg","kung fu",1993),
                new Movie("Movie", 5,"Steven Spielberg","kung fu",1993),
                new Movie("Movie", 5,"Steven Spielberg","kung fu",1993),
                new Movie("Movie", 5,"Steven Spielberg","kung fu",1993),
                new Movie("Movie", 5,"Steven Spielberg","kung fu",1993),
                new Movie("Movie", 5,"Steven Spielberg","kung fu",1993),
                new Movie("Movie", 5,"Steven Spielberg","kung fu",1993),

        };
    }



// what are we doing with the product?
// Where are we placing it?
// how are we calling it?
// Properties of product



    public String type;
    public double price;
    public Product(String type, double price) {
        this.type = type;
        this.price = price;

    }

    public static Product[] ProductArray= Arrays.copyOf(Product.findAll(), Product.findAll().length);

    public static void displayProduct(Product product) {
        System.out.print(product);
    }

//    public String toString() {
//        return String.format("| %-10s | %-8s | %-35s | %12s |\n", type, price, title, pages);
//    }

    public static void displayProduct(String type) {
        Arrays.sort(ProductArray,Product.ProductComparator);

        for(Product product : ProductArray) {


            String Product = product.getType().toString();
            if(type.equals(Product)){
                System.out.println(type);
            }
        }
    }
    public static void displayProduct () {
        Arrays.sort(ProductArray,Product.ProductComparator);


        for(Product product : ProductArray) {
//            if(product.equals(type)) {
                System.out.print(product);
//            }
        }
    }

    public static Comparator<Product> ProductComparator = new Comparator<Product>() {
        @Override
        public int compare(Product o1, Product o2) {
            String productType = o1.getType().toString().replaceAll("^(?i)The ", "").toLowerCase();
            String productType2 = o2.getType().toString().replaceAll("^(?i)The ", "").toLowerCase();
            return productType.compareTo(productType2);
        }
    };

    static Input input =  new Input();

    public String getType() {
        return type;
    }
//    public static String getType(){
//        String type = "unassigned";
//        int typeSelected = input.getInt(1, 6, "Enter the category:\n1 - all\n2 - books\n3 - movies\n4 - snacks\n5 - membership\n6 - questions");
//        switch(typeSelected){
//            case 1:
//                type = "book";
//                break;
//            case 2:
//                type = "movie";
//                break;
//            case 3:
//                type = "horror";
//                break;
//            case 4:
//                type = "scifi";
//                break;
//            case 5:
//                type = "musical";
//                break;
//            case 6:
//                type = "comedy";
//                break;
//        }
//        return type;
//    }




//    public int addToCart() {
//        movieArray=Arrays.copyOf(movieArray, movieArray.length+1);
////        input.getString();
//        String movie = input.getString("Enter the name of the movie: ");
//        movieArray[movieArray.length-1] = new Movie(movie, getCategory());
//        movieArray[movieArray.length-1].setRating(input.getInt(0, 10, "How would you like to rate this movie? "));
//        ;
//    }



//           ######### Vocabulary Definitions #########


//    Class: a blueprint for how a data structure should function
//
//    Constructor: instructs the class to set up the initial state of an object
//
//            Object: instance of a class that stores the state of a class
//
//    Method: set of instructions that can be called on an object
//
//    Parameter: values that can be specified when creating an object or calling a method
//
//    Return value: specifies the data type that a method will return after it runs
//
//    Inheritance: allows one class to use functionality defined in another class


    public double getPrice() {
        return price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}

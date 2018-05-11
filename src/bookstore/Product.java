package bookstore;

import util.Input;

import java.util.Arrays;
import java.util.Comparator;

public abstract class Product {

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

    public static Product[] ProductArray= Arrays.copyOf(ProductInventory.findAll(), ProductInventory.findAll().length);

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

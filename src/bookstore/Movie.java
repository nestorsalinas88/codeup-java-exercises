package bookstore;

public class Movie extends Product implements Cart{
    public String producer;
    public int yearReleased;
    public String name;

    public Movie(String type, double price, String producer, String name, int yearRealeased) {
        super(type, price);
        this.producer = producer;
        this.yearReleased = yearRealeased;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("| %-10s | %-8s | %-2s | %12s | %5s |\n", type, price, producer, name, yearReleased);
    }

    @Override
    public boolean confirmProductSelection() {
        return false;
    }

    @Override
    public int addToCart() {
        return 0;
    }
}

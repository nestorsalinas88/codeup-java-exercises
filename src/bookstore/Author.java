package bookstore;

public class Author extends Person{

    private String name;
    private int number;


    public static void numberOfBooks(int number){
        for (int i = 0; i <= 10; i++) {
            Math.floor(Math.random());
        }
    }
    public Author(String name) {
        super(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

package bookstore;

public class Author extends Person{

    private String name;
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

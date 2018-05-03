public class People {
    public String firstName;
    public String lastName;


//    instance method
    public String fullName() {
        return String.format("%s %s", firstName, lastName);
    }

    public String yellName(){
        return firstName.toUpperCase();
    }
}

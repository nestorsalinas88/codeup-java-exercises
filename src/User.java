public class User {


    String email;
    String username;
    String password;
    Boolean isAdmin;

    protected static int numberOfUsers = 0;

//    Constructor is the function called on object creation
//    Method Overloading
    User(){
        numberOfUsers++;
    }
    static int getNumberOfUsers(){
        return  numberOfUsers;
    }
}

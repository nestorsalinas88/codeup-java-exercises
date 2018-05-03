public class UserApplication {
    public static void main(String[] args) {

        System.out.println("welcome to my app");
        System.out.println("Currently, we have " + User.getNumberOfUsers() + " of users");

        User luis = new User();
        luis.email = "Luis@gmail.com";
        luis.username = "luis33";
        luis.password = "password123";
        luis.isAdmin = true;

        System.out.println(luis.username + "'s email address is " + luis.email);

        User nestor = new User();
        nestor.email = "yahoo";
        nestor.username = "ne12";
        nestor.password = "kjhasd";
        nestor.isAdmin = false;
        System.out.println(nestor.username);

    }
}

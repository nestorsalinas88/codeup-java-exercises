public class ServerNameGenerator {


    public static void main(String[] args) {

//        created two new arrays
        String [] adjectives = {"big", "small", "gray", "massive", "chubby", "fat","skinny","hot","cold","giant"};


        String [] nouns = {"cats","dogs","horses","monkeys","rats","lions","pigs","birds","insects","elephants"};

//        The name of the server
        System.out.println("Here is your server name: ");
        System.out.println(randomElement(adjectives) + "-" + randomElement(nouns));
    }

    public static String randomElement(String[] name){
        return name[(int) (Math.random() * name.length)];
    }
}

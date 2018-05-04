public class Person {
        private String name;


        // returns the person's name
        public String getName(){
            return name;
        }


        // changes the name property to the passed value
        public void setName(String input){
            this.name = input ;
        }


        // prints a message to the console using the person's name
        public void sayHello(){
            System.out.println("Hello from " + this. name);
        }



        public Person(String name) {
            this.name = name;
        }

//    public static void main(String[] args) {
//            // Returns two booleans = true; false;
//
//            /*
//            Person person1 = new Person("John");
//            Person person2 = new Person("John");
//            System.out.println(person1.getName().equals(person2.getName()));
//            System.out.println(person1 == person2);
//            */
//
//
//
//            // Returns a boolean = true;
//
//            /*
//            Person person1 = new Person("John");
//            Person person2 = person1;
//            System.out.println(person1 == person2);
//            */
//
//
//            // Returns strings with names
//
//            /*
//            Person person1 = new Person("John");
//            Person person2 = person1;
//            System.out.println(person1.getName());
//            System.out.println(person2.getName());
//            person2.setName("Jane");
//            System.out.println(person1.getName());
//            System.out.println(person2.getName());
//            */
//
//
//    }

        public static void main(String[] args) {

            Person person1 = new Person("John");
            Person person2 = person1;
            person2.setName("Jane");
            System.out.println(person1.getName());
            System.out.println(person2.getName());

        }


}

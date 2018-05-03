public class Person {
        private String name;

        public Person(String name) {
            this.name = name;
        }


        public String getName(){
            return this.name;
        }
        public void setName(String input) {
            this.name =  input;
        }

        public void sayHello() {
            System.out.println("Hello from " + this.name);
        }





}

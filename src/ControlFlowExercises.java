public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 2;
//        while (i <= 15){
//            System.out.println("i is " + i);
//            i++;
//
//        }

        do {
            System.out.println("i is " + i);
            i *= 2;
        } while (i <= 1000000);

    }
}

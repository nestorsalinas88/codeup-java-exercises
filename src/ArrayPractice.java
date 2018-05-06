import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {

        double [] numbers;//        variable declaration
        boolean [] booleans;


        numbers = new double [7]; //        instantiation
        booleans = new boolean[5];


        numbers[0] = 6; // in Java arrays do not have methods


        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(booleans));

//        vector =
//        matrix = x, y
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}

        };
//        System.out.println(matrix[2][2]);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%d ",matrix[i][j]);
            }
            System.out.printf("%n");
        }

        String[] names = {
        "nestor", "John", "Richard"
        };

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }


         int [] phones = {
                 2520, 1800, 7654-3453
        };

        for (int i = 0; i < phones.length; i++) {
            System.out.println(phones[i]);
        }

//        multidimensional array

//        Think about problems and the way we find the solution

//        Global company needs to store employee data in a network.




    }
}

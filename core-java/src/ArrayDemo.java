import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {

        int[] ar = {7, 3, 5, 2, 4};

      
        Arrays.sort(ar);

   
        System.out.println("Sorted Array: " + Arrays.toString(ar));

   
        for (int n : ar) {
            System.out.println(n);
        }

    
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}

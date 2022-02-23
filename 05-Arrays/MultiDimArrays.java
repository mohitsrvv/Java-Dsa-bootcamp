import java.util.Arrays;
import java.util.Scanner;

public class MultiDimArrays {
    public static void main(String[] args){
        // int[][] arr = new int[3][];
        Scanner in = new Scanner(System.in);
        // int[][] arr = {
        //     {1, 2, 3},
        //     {4, 5},
        //     {6, 7, 8, 9}
        // };

        int[][] arr = new int[3][3];
        System.out.println(arr.length); 
        // Input
        for(int row = 0; row < arr.length; row++){
            for(int column = 0; column < arr[row].length; column++){
                arr[row][column] = in.nextInt();
            }
        }
        System.out.println("Your output");
        // output
        // for(int row = 0; row < arr.length; row++){
        //     for(int column = 0; column < arr[row].length; column++){
        //         System.out.print(arr[row][column] + " ");
        //     }
        //     System.out.println();
        // }
        
        // output
        for(int row = 0; row < arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}
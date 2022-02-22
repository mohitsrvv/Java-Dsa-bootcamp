// public class Main {
//     public static void main(String[] args){
//         Scanner in = new Scanner(System.in);
//         // String[] arr = new String[4];
//         // System.out.println(arr[1]);

//         // int[] rolln = new int[5];
//         // int[] rollno = {21, 31, 33, 44, 42};

//         int[] arr = new int[5];
//         arr[0] = 11;
//         arr[1] = 12;
//         arr[2] = 13;
//         arr[4] = 15;
//         for(int i=0; i<arr.length; i++){
//             arr[i] = in.nextInt();
//         }
//         // for(int i=0; i<arr.length; i++){
//         //     System.out.println(arr[i] +" ");
//         // }

//         System.out.println(Arrays.toString(arr));
// }

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        // arrays of primitives
        // int[] arr = new int[5];
        // for(int i=0; i<arr.length; i++){
        //     arr[i] = in.nextInt();
        // }
        // System.out.println(Arrays.toString(arr));

        // arrays of objects
        String[] str = new String[5];
        for(int i=0; i<str.length; i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
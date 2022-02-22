import java.util.Scanner;

// Its an example to find 5 in numbers 

// public class CountNums {
//     public static void main(String[] args){
//         System.out.print("Enter your number: ");
//         Scanner input = new Scanner(System.in);
//         int n = input.nextInt();

//         int count = 0;
//         while(n > 0){
//             int rem = n % 10;
//             if (rem == 5){
//                 count++;
//             }
//             n = n / 10;
//         }
//         System.out.println(count);
//     }
// }



// finding 3 in numbers

public class CountNums {
    public static void main(String[] args){
        System.out.print("Enter your number: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int count = 0;
        while(num > 0){
            int rem = num % 10;
            if(rem == 3){
                count++;
            }
            num = num / 10;
        }
        System.out.println(count);
    }
}
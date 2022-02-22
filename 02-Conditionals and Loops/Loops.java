import java.util.Scanner;

public class Loops {
    public static void main(String[] args){
         // for(int num = 1; num <= 5; num++){
        //     System.out.println(num);
        // }

        // print a number from 1 to n
        // System.out.print("Enter a number: ");
        // Scanner input = new Scanner(System.in);
        // int n = input.nextInt();

        // for(int num = 1; num <= n; num++){
        //     System.out.print(num + " ");
        // }

        // while loops
        int num = 1;
        while (num <= 5){
            // System.out.println(num);
            num++;
        }

        // use the while loops when you don't know how many times program going to run
        // use the for loops when you know how many times program going to run

        // do while loops
        int n = 1;
        do {
            System.out.println(n);
            n++;
        } while (n <= 5);
    }
}

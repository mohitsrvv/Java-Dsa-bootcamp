import java.util.Scanner;

public class pro_01 {
    public static void main(String[] args){
        // Write a program to print whether a number is even or odd, also take input from the user
        Scanner in = new Scanner(System.in);
        int num;
        System.out.print("Enter your number: ");
        num = in.nextInt();
        if(num % 2 == 0){
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}

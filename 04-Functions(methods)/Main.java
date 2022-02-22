import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // Qus. Take input of 2 numbers and print sum of them
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter second number: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum of two numbers: " + sum);
    }
}

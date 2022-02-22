import java.util.Scanner;

public class Sums {
    public static void main(String[] args){
        sum();
        sum();
    }
    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter second number: ");
        int num2 = in.nextInt();
        System.out.println("The sum of two numbers: " + (num1 + num2));
    }
}

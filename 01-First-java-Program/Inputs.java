import java.util.Scanner;

public class Inputs {
    public static void main(String[] args){
        System.out.println("hello babe, Enter your phone number !: ");
        Scanner input = new Scanner(System.in);
        long  phoneNumber = input.nextLong();
        System.out.println("My phone number is " + phoneNumber);
    }
}
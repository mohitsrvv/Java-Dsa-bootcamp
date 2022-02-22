import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Mango");
        System.out.println("Apple");
        System.out.println("Orange");
        System.out.println("Grapes");
        System.out.println();
        System.out.print("Enter your fruit: ");
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit) {
            case "Mango":
                System.out.println("King of fruits");
                break;
            case "Apple":
                System.out.println("Sweet red fruit");
                break;
            case "Orange":
                System.out.println("Round fruit");
                break;
            case "Grapes":
                System.out.println("Small fruit");
                break;        
            default:
                System.out.println("please enter a valid fruit");
        }
    }
}

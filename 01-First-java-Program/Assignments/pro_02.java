import java.util.Scanner;

public class pro_02 {
    public static void main(String[] args){
        // Take name as input and print a greeting message for that particular name.
        Scanner in = new Scanner(System.in);
        String name;
        System.out.print("Enter your name sir/mam: ");
        name = in.next();
        System.out.println("Good morning " + name);
    }
}

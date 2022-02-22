import java.util.Scanner;

public class charCheck {
    public static void main(String[] args){
        System.out.print("Enter your character: ");
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);

        if(ch >= 'a' && ch <= 'z'){
            System.out.println("Lowercase");
        }
        else {
            System.out.println("Uppercase");
        }
    }
}

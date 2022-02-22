import java.util.Scanner;

public class input {
    public static void main(String[] args){
        System.out.println("Hello dude, Enter your integer !");
        Scanner input = new Scanner(System.in);
        System.out.println(input.nextInt()); 
        System.out.println("Hello, Enter your statement !");
        Scanner word = new Scanner(System.in);
        System.out.println(word.nextLine());
    } 
}
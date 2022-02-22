import java.util.Scanner;

public class Reverse {
    public static void main(String[] args){
        System.out.print("Enter your number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        int ans = 0;
        while(num > 0){
            int rem = num % 10;
            num = num / 10;
            ans = ans * 10 + rem;
        }
        System.out.println(ans);
    }
}
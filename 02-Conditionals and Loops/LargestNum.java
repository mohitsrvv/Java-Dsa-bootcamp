import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args){
        System.out.print("Enter your numbers: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int max = a;
        if(b > max){
            max = b;
        }
        if(c > max){
            max = c;
        }

        System.out.println(max);
    }
}
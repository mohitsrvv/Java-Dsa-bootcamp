import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args){
        // Scanner input = new Scanner(System.in);
        // float number = input.nextFloat();
        // System.out.println(number);

        // Typecasting
        int num = (int)(657.33f);
        System.out.println(num);

        // automatic type promotion in expressions
        int a = 257;
        byte b = (byte)(a);   // 257 % 256 = 1
        System.out.println(b);
    }
}

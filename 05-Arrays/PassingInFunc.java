import java.util.Arrays;

public class PassingInFunc {
    public static void main(String[] args){
        int[] nums = {21,31,34,634,5326,234,31};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;
    }
}

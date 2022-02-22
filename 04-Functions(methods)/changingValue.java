import java.util.Arrays;

public class changingValue{
    public static void main(String[] args){
        int[] arr = {1, 21, 2442, 32, 34};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[1] = 20;
    }
}
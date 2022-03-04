public class Ceiling {
    public static void main(String[] args){
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }

    // return the index: smallest element in the array >= target
    // return -1 if it is does not exist
    static int ceiling(int[] arr, int target){
        if(target > arr[arr.length - 1]){
            return -1;
        }
        
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            // find the middle element
            // int mid = (start + end) / 2; the problem here is int have fixed size
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            } else if(target > arr[mid]){
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return start;
    }
}

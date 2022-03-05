// https://leetcode.com/problems/peak-index-in-a-mountain-array/

public class MountainArray {
    public static void main(String[] args){

    }

    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]){
                // you are in dec part of the array
                // this may be the ans, but look at the left
                // this is why end!= mid-1
                end = mid;
            } else {
                // you are asc part of the array
                start = mid + 1;     // because we know that mid+1 element > mid element
            }
        }
        // in the end, start == end, end pointing to largest number because of the 2 checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
        return start; // or return end, both are equal
    }
}

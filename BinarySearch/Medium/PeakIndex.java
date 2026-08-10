package BinarySearch.Medium;
// 852 problem number on leetcode
// 162 problem number on leetcode

public class PeakIndex {
    public static int peak(int arr[]){
        int start = 0;
        int end = arr.length;
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int arr[] = {0,1,0};
        System.out.println(peak(arr));

    }
}

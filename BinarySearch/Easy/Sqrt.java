package BinarySearch.Easy;

// 69 problem number on leetcode 
public class Sqrt {
    public static int find(int n){
        int left = 1;
        int right = n;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(mid == n/mid){
                return mid;
            }
            if(mid<n/mid){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return right;
    }
    public static void main(String[] args) {
        int n = 17;
        System.out.println(find(n));
    }
}

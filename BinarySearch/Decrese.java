package BinarySearch;

public class Decrese {

    static int search(int arr[],int target){
        int s = 0;
        int e = arr.length-1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]>target){
                s = mid+1;
            }
            else{
                e = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {8,7,6,5,4,3,2};
        System.out.println(search(arr,3));
    }
}

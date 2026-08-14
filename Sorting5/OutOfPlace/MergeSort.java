package Sorting5.OutOfPlace;

public class MergeSort {
    static void merge_sort(int arr[],int start,int end){
        if(start<end){
        
            int mid = start + (end-start)/2;
            merge_sort(arr, start,mid);
            merge_sort(arr, mid+1, end);
            merge(arr,start,mid,end);
        }
    }
    static void merge(int arr[],int start,int mid,int end){
        int nums[] = new int[end-start+1];
        int i = start;
        int j = mid+1;
        int k = 0;
        while(i<=mid && j<=end){
            if(arr[i]>arr[j]){
                nums[k] = arr[j];
                j++;
            }
            else{
                nums[k] = arr[i];
                i++;
            }
            k++;
        }
        while(i<=mid) {
            nums[k] = arr[i];
            i++;
            k++;
        }
        while(j<=end) {
            nums[k] = arr[j];
            j++;
            k++;
        }
        for(int r=0; r<nums.length;r++){
            arr[start+r] = nums[r];
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,3,8,1,2,7,4,6};
        merge_sort(arr,0,arr.length-1);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}

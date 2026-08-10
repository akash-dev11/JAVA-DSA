package BinarySearch.Medium;
// 33 problem number on leetcode

public class Find_peak_inRotateArray {
    static int pivot(int arr[]){
        int s =0;
        int e = arr.length-1;
        while(s<e){
            int m = s + (e-s)/2;
            if(arr[m]>arr[m+1]&& e>=m){
                return m;
            }
            if(arr[m]<arr[m-1]&& m>=s){
                return m-1;
            }
            if(arr[s]<arr[m]){
                s = m+1;
            }
            else{
                e = m-1;
            }
        }
        return -1;
    }

    static int binary_search(int arr[],int target,int s,int e){
        while(s<=e){
            int m = s + (e-s)/2;
            if(arr[m]==target){
                return m;
            }
            if(arr[m]>target){
                e = m-1;
            }
            else{
                s = m+1;
            }
        }
        return -1;
    }
    static int search(int arr[],int target){
        int find_pivot = pivot(arr);
        if(find_pivot==-1){
            return binary_search(arr,target,0,arr.length-1);
        }
        if(target>=arr[0]){
            return binary_search(arr, target, 0, find_pivot-1);
        }
        if(target==arr[find_pivot]){
            return find_pivot;
        }
        return binary_search(arr, target, find_pivot+1, arr.length-1);
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 2;
        System.out.println(search(arr,target));
    }
}

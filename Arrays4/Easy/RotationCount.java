package Arrays4.Easy;

// problem on GFG 
public class RotationCount {
// approach 2  time com = O(nlogn);
    static int rotate_count(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while (start<=end) {
            int mid  = start + (end-start)/2;
            if(arr[mid]<arr[end]){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }
        return end;
    }

// approach 1 time com = O(n)
    static int rotate_c(int arr[]){
        int min = arr[0];
        int min_index = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
                min_index = i;
            }
        }
        return min_index;
    }
    public static void main(String[] args) {
        int arr[] = {7,9,11,12,5};
        System.out.println(rotate_count(arr));
        System.out.println(rotate_c(arr));

    }
}

import java.util.Arrays;

public class Binary_search {

    public static int[] Search_2D(int arr[][],int target){
        int row = 0;
        int col = arr.length-1;
        while(row<arr.length && col>=0){
            if(arr[row][col]== target){
                return new int[]{row,col};
            }
            if(arr[row][col]>target){
                col--;
            }
            else{
                row++;
            }
        } 
        return new int[]{-1,-1};
    }
    // public static int Binary_search_decrease(int nums[],int target){
    //     int start = 0;
    //     int end = nums.length-1;
    //     while(start<=end){
    //         int mid = start + (end-start)/2;
    //         if(nums[mid]==target){
    //             return mid;
    //         }
    //         else if(nums[mid]<target){
    //             end = mid -1;
    //         }
    //         else{
    //             start = mid+1;
    //         }
    //     }
    //     return -1;

    // }

    // public static int Binary_Search_increase(int nums[],int target){
    //     int start =0;
    //     int end = nums.length-1;
    //     while(start<=end){
    //         // int mid = (i+j)/2;
    //         int mid = start + (end-start)/2;
    //         if(nums[mid]==target){
    //             return mid;
    //         }
    //         else if(nums[mid]<target){
    //             start = mid +1;
    //         }
    //         else{
    //             end = mid-1;
    //         }
        
    //     }
    //     return -1;
    // }
    public static void main(String[] args){
        // int nums[] = {3,4,5,6,76,77,87,97,111};
        // int target = 77;
        // int x = Binary_Search_increase(nums,target);
        // System.out.println(x);

        // int nums[] = {23,21,20,12,11};
        // int target = 23;
        // int v = Binary_search_decrease(nums, target);
        // System.out.println(v);

        int arr[][] = {{10,20,30,40},
                        {15,25,35,45},
                          {28,29,37,49},
                            {33,34,38,50}};
        System.out.println(Arrays.toString(Search_2D(arr, 37)));
    }
    
}

public class Binary_search {
    public static int Binary_search_decrease(int nums[],int target){
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                end = mid -1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;

    }

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

        int nums[] = {23,21,20,12,11};
        int target = 23;
        int v = Binary_search_decrease(nums, target);
        System.out.println(v);
    }
    
}

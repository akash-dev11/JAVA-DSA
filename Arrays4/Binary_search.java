public class Binary_search {

    public static int Binary_Search(int nums[],int target){
        int start =0;
        int end = nums.length-1;
        while(start<=end){
            // int mid = (i+j)/2;
            int mid = start + (end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                start = mid +1;
            }
            else{
                end = mid-1;
            }
        
        }
        return -1;
    }
    public static void main(String[] args){
        int nums[] = {3,4,5,6,76,77,87,97,111};
        int target = 77;
        int x = Binary_Search(nums,target);
        System.out.println(x);
    }
    
}

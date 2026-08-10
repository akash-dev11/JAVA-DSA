package BinarySearch.Easy;

// 744 problem number on leetcode
public class Find_small{
    static char letter(char arr[],char target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]>target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return arr[start%arr.length];
    }
    public static void main(String[] args) {
        char arr[] = {'c','f','j'};
        System.out.println(letter(arr,'j'));
    }
}

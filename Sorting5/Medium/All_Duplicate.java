package Sorting5.Medium;

import java.util.ArrayList;
import java.util.List;

// 442 problem number on leetcode
public class All_Duplicate {
    static List<Integer> Duplicate(int arr[]){
        List<Integer> ans = new ArrayList<>();
        int i=0; 
        int end = arr.length;
        while(i<end){
            int index = arr[i]-1;
            if(arr[i]!=arr[index]){
                swap(arr, i, index);
            }
            else{
                i++;
            }
        }
        for(int start=0; start<end; start++){
            if(arr[start]!=start+1){
                ans.add(arr[start]);
            }
        }
        return ans;
    }
    static void swap(int arr[],int i,int ind){
        int tem = arr[i];
        arr[i] = arr[ind];
        arr[ind] = tem;
    }
    public static void main(String[] args) {
        int arr[] = {4,3,2,7,8,2,3,1};
        System.out.println(Duplicate(arr));

    }
}

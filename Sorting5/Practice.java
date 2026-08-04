package Sorting5;

import java.util.ArrayList;
import java.util.List;

public class Practice {

    public static List<Integer> findMissingNumber(int arr[]){
        int i = 0;
        int end = arr.length;
        while(i<end){
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct]){
                int tem = arr[i];
                arr[i] = arr[correct];
                arr[correct] = tem;
            }
            else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int index = 0; index<arr.length; index++){
            if(arr[index]!=index+1){
                ans.add(index+1);
            }
        }
        return ans;

    }
    public static void main(String[] args){
        int arr[] = {4,3,2,7,8,2,3,1};
        System.out.println(findMissingNumber(arr));
    }
}

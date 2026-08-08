package Sorting5.Easy;
import java.util.ArrayList;
import java.util.List;

// 448 problem number on leetcode
public class All_Missing_value {
    static List<Integer> All_missing(int arr[]){
        int i =0;
        int end = arr.length;
        List<Integer> ans = new ArrayList<>();
        while(i<end){
            int index = arr[i] -1;
            if(arr[i]!=arr[index]){
                swap(arr,i,index);
            }
            else{
                i++;
            }
        }
        for(int start=0; start<end; start++){
            if(arr[start]!=start+1){
                ans.add(start+1);
            }
        }
        return ans;
    }
    static void swap(int arr[],int i,int s){
        int tem = arr[i];
        arr[i] = arr[s];
        arr[s] = tem;
    }
    public static void main(String[] args) {
        int arr[] = {4,3,2,7,8,2,3,1};
        System.out.println(All_missing(arr));
    }
}

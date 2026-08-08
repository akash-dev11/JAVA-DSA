package Sorting5.Easy;
import java.util.Arrays;

// 645 problem number on leetdcode

public class Set_misMatch {
    static int[] Dublicat_Index(int arr[]){
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
                return new int[]{arr[start],start+1};
            }
        }
        return new int[]{-1,-1};
    }
    static void swap(int arr[],int i,int ind){
        int tem = arr[i];
        arr[i] = arr[ind];
        arr[ind] = tem;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,4};
        System.out.println(Arrays.toString(Dublicat_Index(arr)));
    }
}

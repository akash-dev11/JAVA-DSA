package Easy;
import java.util.Arrays;

// 1929 problem number on leetcode
public class ConcatenationArray {
    public static int[] concatation(int arr[]){
        int n = arr.length;
        int ans[] = new int[2*n];
        for(int i=0; i<n; i++){
            ans[i] = arr[i];
            ans[i+n] = arr[i];
        }
        return ans;
    }
    public static void main(String[] args){
        int arr[] = {1,2,1};
        System.out.println((Arrays.toString(concatation(arr))));

    }
    
}

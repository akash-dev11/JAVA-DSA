package BinarySearch.Medium;
import java.util.Arrays;

public class First_And_last_occurence {

    static int last_and_first(int arr[], int target,Boolean thrudh){
        int s =0;
        int e =arr.length-1;
        int a = -1;
        while(s<=e){
            int m = s + (e-s)/2;
            if(arr[m]>target){
                e = m-1;
            }
            else if(arr[m]<target){
                s = m+1;
            }
            else{
                a = m;
                if(thrudh){
                    e = m-1;
                }
                else{
                    s = m+1;
                }
            }
        }
        return a;
    }

    static int[] search(int arr[],int target){
        int ans[] = {-1,-1};
        int right = last_and_first(arr, target, true);
        int left = last_and_first(arr, target, false);
        ans[0] = right;
        ans[1] = left;
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {5,7,7,8,8,8,10};
        System.out.println(Arrays.toString(search(arr,8)));

    }
}

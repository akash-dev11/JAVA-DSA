package ArrayD;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Transpose {
    static ArrayList<ArrayList<Integer>> transpose(int arr[][]){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int col =0; col<arr[0].length; col++){
            ArrayList<Integer> sec = new ArrayList<>();
            for(int row=0; row<arr.length; row++){
                sec.add(arr[row][col]);
            }
            ans.add(sec);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] arr  = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(transpose(arr));
    }
}

package ArrayD.Easy;

import java.util.ArrayList;

public class Downword {
    static ArrayList<Integer> diagView(int mat[][]) {
        // code here
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int rows = mat.length;
        int cols = mat[0].length;
        
        for(int col =0; col<cols; col++){
            int i=0;
            int j =col;
            while(i<rows && j>=0){
                ans.add(mat[i][j]);
                i++;
                j--;
            }
        }
        
        for(int row=1; row<rows; row++){
            int i=row;
            int j=cols-1;
            while(i<rows && j>=0){
                ans.add(mat[i][j]);
                i++;
                j--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        
    }
}

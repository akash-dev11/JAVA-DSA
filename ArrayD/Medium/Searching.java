package ArrayD.Medium;

public class Searching {
    static boolean search(int arr[][],int x){
        int row =0;
        int col = arr[0].length-1;
        while(row<arr.length && col>=0){
            if(arr[row][col]==x){
                return true;
            }
            if(arr[row][col]>x){
                col--;
            }
            else{
                row++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int x = 61;
        System.out.println(search(arr, x));
    }
}

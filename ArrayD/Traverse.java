package ArrayD;

public class Traverse {
    static void traverse(int arr[][],int row,int col){
        if(row==arr.length-1 && col==arr[0].length-1){
            System.out.print(arr[row][col]);
            return;
        }

        System.out.println(arr[row][col]);
        if(col<arr[0].length-1){
            traverse(arr, row, col+1);
        }
        if(row<arr.length-1){
            traverse(arr, row+1, 0);
        }

    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        traverse(arr,0,0);

    }
}

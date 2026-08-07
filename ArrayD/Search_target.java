package ArrayD;



public class Search_target {
    static void search(int arr[][],int target){
        int row = 0;
        int col = arr.length-1;
        if(target==arr[row][col]){
            System.out.print(row+" "+col);
        }
        else if(target<arr[row][col]){
            row++;
        }
        else if(target>arr[row][col]){
            col--;
        }
    }
    public static void main(String[] args) {
        // sorted matrix
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        search(arr,6);
    }
}

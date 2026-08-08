package ArrayD;



public class Search_target {
    static void search(int arr[][],int target){
        int row = 0;
        int col = arr[0].length-1;
        while(row<arr.length && col>=0){

            if(target==arr[row][col]){
                System.out.print(row+" "+col);
                return;
            }
            if(target<arr[row][col]){
                col--;
            }
            if(target>arr[row][col]){
                row++;
            }
        }
    }
    public static void main(String[] args) {
        // sorted matrix
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        search(arr,6);
    }
}

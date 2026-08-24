package ArrayD.Easy;

public class ToeplitzMatrix {
    public static boolean isToeplitz(int[][] mat) {
        // code here
        for(int i=0; i<mat.length-1; i++){
            for(int j=0; j<mat[0].length-1; j++){
                if(mat[i][j]!=mat[i+1][j+1]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[][] = {{6, 7, 8}, {4, 6, 7}, {1, 4, 6}};
        System.out.println(isToeplitz(arr));
    }
}

package ArrayD.Medium;

public class MagicSquare {
    
    public static  boolean magicSquare(int[][] mat) {
        int n = mat.length;
        boolean[] visit = new boolean[n*n+1];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                int value = mat[i][j];
                if(value<1 || value>n*n||visit[value]){
                    return false;
                }
                visit[value] = true;
            }
        }
        int target =0;
        for(int i=0; i<n; i++){
            target +=mat[0][i];
        }
        // check row
        for(int i=0; i<n; i++){
            int sum =0;
            for(int j=0; j<n; j++){
                sum +=mat[i][j];
            }
            if(sum != target){
                return false;
            }
        }
        // check column
        for(int j=0; j<n; j++){
            int sum =0;
            for(int i=0; i<n; i++){
                sum += mat[i][j];
            }
            if(sum != target){
                return false;
            }
        }
        int sum =0;
        for(int i=0; i<n; i++){
            sum += mat[i][i];
        }
        if(sum!=target){
            return false;
        }
        int sum2=0;
        for(int i=0; i<n; i++){
            sum2 += mat[i][n-i-1];
        }
        if(sum2 !=target){
            return false;
        }
        
        return true;
        
    }
    public static void main(String[] args) {
        int arr[][] = {{2,7,6},{9,5,1},{4,3,8}};
        System.out.println(magicSquare(arr));
    }
}


package ArrayD.Easy;

// 1252 problem number 
public class CellswithOdd {
    // Approach 1
    public static int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];
        int row =0;
        int col =0;
        for(int i=0; i<indices.length; i++){
            row = indices[i][0];
            col = indices[i][1];
            for(int j=0; j<n; j++){
                matrix[row][j]++;
            }
            for(int k=0; k<m; k++){
                matrix[k][col]++;
            }
        }
        int count =0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j]%2 !=0){
                    count++;
                }
            }
        }
        return count;
    }

    // Second approch 
    static int second(int m,int n,int[][] indices){
        int[] row = new int[m];
        int[] col = new int[n];
        for(int i=0; i<indices.length; i++){
            int r = indices[i][0];
            int c = indices[i][1];
            row[r]++;
            col[c]++;
        }
        int count =0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if((row[i]+col[j])%2 !=0){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[][] indices = {{0,1},{1,1}};
        System.out.println(oddCells(2,3,indices));
        System.out.println(second(2, 3, indices));
    }
}

package ArrayD.Medium;

public class Question {
    public static void  find(int mat[][]){
         int startRow = 0;
        int startCol = 0;
        int endRow = mat.length-1;
        int endCol = mat[0].length-1;
    
        while(startRow<=endRow && startCol<=endCol){
            // Top
            for(int i = startCol; i<=endCol; i++){
                if(startRow==endRow){
                    break;
                }
                System.out.print(mat[startRow][i]+" ");
            }
            // right
            for(int j=startRow+1; j<=endRow; j++){

                System.out.print(mat[j][endCol]+" ");

            }
            // bottom
            for(int i=endCol-1; i>=startCol; i--){
                System.out.print(mat[endRow][i]+" ");
            }
            // left
            for(int j=endRow-1; j>=startRow+1; j--){
                if(startCol==endCol){
                    break;
                }
                System.out.print(mat[j][startCol]+" ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }

    }
    public static void main(String[] args){
        int mat[][] = {{1,2,3,4},
                      {5,6,7,8}
                      ,{9,10,11,12},
                      {13,14,15,16}};
        find(mat);
    }
       
}

package ArrayD.Medium;

public class SetMatrix_zero {
    // Approach 1 bruete force
    static void space(int arr[][]){
        int n= arr.length;
        int m= arr[0].length;
        boolean row[] = new boolean[n];
        boolean col[] = new boolean[m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(arr[i][j]==0){
                    row[i]=true;
                    col[j] =true;
                }
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(row[i]||col[j]){
                    arr[i][j] = 0;
                }
            }
        }
    }

    // Approach 2

    static void print(int arr[][]){
        for(int i=0; i<arr.length; i++){
            for(int j=0;j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[][] = { 
            { 0, 1, 2, 0 },
            { 3, 4, 4, 2 },
            { 1, 3, 1, 5 }
        };
        space(arr);
        print(arr);
    }
}

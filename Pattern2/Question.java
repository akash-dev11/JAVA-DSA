



public class Question {

    public static void Mast(int n){
        n = n*2;
        for(int i=0; i<=n; i++){
            for(int j=0; j<=n; j++){
                int max = Math.max(Math.max(i, j),Math.max(n-i,n-j));
                System.out.print(max+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int n = 3;
        Mast(n);
















    }
}

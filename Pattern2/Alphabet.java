import java.util.Scanner;
public class Alphabet{

    public static void print(int n){
        for(int i=1; i<=n; i++){
            char ch = (char)('A'+n-i);
            for(int j=1; j<=i; j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
    
    public static void alphaAZ_reverse(int n){
        char ch = 'A';
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(ch+" ");
                ch++;
            }
            
            System.out.println();
        }
    }

    public static void alphaAZ(int n){
        char ch = 'A';
        for(int i=1; i<=n; i++){
            ch = 'A';
            for(int j=1; j<=i; j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        alphaAZ(n);
        alphaAZ_reverse(n);
        print(n);

    }
}
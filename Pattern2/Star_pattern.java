package Pattern2;
import java.util.Scanner;
public class Star_pattern {
    //  public static void diamond(int n){
    //     for(int i=1; i<=n; i++){
    //         for(int j=1; j<=n-i; j++){
    //             System.out.print("  ");
    //         }
    //         for(int j=1; j<=2*i-1; j++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    //      for(int i=n-1; i>=1; i--){
    //         for(int j=1; j<=n-i; j++){
    //             System.out.print("  ");
    //         }
    //         for(int j=1; j<=2*i-1; j++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void pyramid(int n){
    //     for(int i=1; i<=n; i++){
    //         for(int j=1; j<=n-i; j++){
    //             System.out.print("  ");
    //         }
    //         for(int j=1; j<=2*i-1; j++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void right_angle(int n){
    //     for(int i=0; i<n; i++){
    //         for(int j=0; j<=i; j++){
    //             System.out.print("*"+" ");
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void inverted(int n){
    //     for(int i=0; i<n; i++){
    //         for(int j=0; j<n-i;j++){
    //             System.out.print("*"+" ");
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void square(int n){
    //     for(int i=0; i<n; i++){
    //         for(int j=0; j<n; j++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void hollow_square(int n){
    //     for(int i=0; i<n; i++){
    //         for(int j=0; j<n; j++){
    //             if(i==0 || i==n-1 || j==0||j==n-1){
    //                 System.out.print("* ");
    //             }
    //             else{
    //                 System.out.print("  ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void inverted_tringle(int n){
    //     for(int i=0; i<n; i++){
    //         for(int j=0; j<i; j++){
    //           System.out.print("  ");
    //         }
    //         for(int j=0; j<n-i; j++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void hollow_right(int n){
    //     for(int i=0; i<n; i++){
    //         for(int j=0; j<=i; j++){
    //             if(i==0 || i==n-1 || j==i|| j==0 ){
    //                 System.out.print("* ");
    //             }
    //             else{
    //                 System.out.print("  ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //right_angle(n);
        //inverted(n);
        //pyramid(n);
        //diamond(n);
        //square(n);
        //hollow_square(n);
        //inverted_tringle(n);
        // hollow_right(n);

    }
}

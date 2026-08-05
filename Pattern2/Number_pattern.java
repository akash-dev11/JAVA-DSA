import java.util.Scanner;

public class Number_pattern {
    public static void alternative(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void number_pyramid(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
             for(int j=i-1; j>=1; j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void right_alinged(int n){
        int num = 1;
        for(int i=1; i<=n; i++){
            num = 1;
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }

    public static void same_number(int n){
        int num = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num+" ");
                
            }
            System.out.println();
            num++;
        }
    }

    public static void rever_floyd_tringle(int n){
        int num = n*(n+1)/2;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num+" ");
                num--;
            }
            System.out.println();
        }
    }

    public static void floyd_tringle(int n){
        int num = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }


    public static void Increase(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Increase(n);
        floyd_tringle(n);
        rever_floyd_tringle(n);
        same_number(n);
        right_alinged(n);
        number_pyramid(n);
        alternative(n);
        
    }
}

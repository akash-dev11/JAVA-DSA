import java.util.Arrays;

public class RecursionPattern {

    static void reverse_triagle(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            System.out.print("* ");
            reverse_triagle(r, c+1);
        }
        else{
            System.out.println();
            reverse_triagle(r-1, 0);
        }
    }

    static void triagle(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            triagle(r, c+1);
            System.out.print("*");
        }
        else{
           triagle(r-1, 0);
            System.out.println();
        }
    }

    static void bubble(int arr[],int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[c+1]){
                int tem = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = tem;
            }

            bubble(arr, r, c+1);
        }
        else{
           bubble(arr,r-1, 0);
        }
    }

    static void Selection(int arr[],int r,int c,int max){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[max]){
                Selection(arr, r, c+1, c);
            }
            else{
                Selection(arr, r, c+1, max);
            }
        }
        else{
           int tem = arr[max];
           arr[max]  = arr[r-1];
           arr[r-1] = tem;
           Selection(arr, r-1, 0, 0);
        }
    }


    public static void main(String[] args) {
        reverse_triagle(4, 0);
        triagle(4, 0);
        System.out.println();

        int arr[] = {4,3,2,1};
        bubble(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));

        int arr1[] = {5,4,1,2,3};
        Selection(arr1, arr1.length, 0, 0);
        System.out.println(Arrays.toString(arr1));
    }
}

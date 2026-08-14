package Basic;

public class RemoveAtBeginning {
    static void remove(int arr[]){
        int n = arr.length;
        for(int i=1; i<n; i++){
            arr[i-1]  = arr[i];
        }
        n = arr.length-1;
        print(arr,n);
    }
    static void print(int arr[],int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40};
        remove(arr);

    }
}

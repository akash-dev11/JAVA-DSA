package Arrays4.Medium;

public class LeftRotate {
    static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void rotate_left(int arr[],int pos){
        int n = arr.length;
        pos = pos%n;
        for(int i=0; i<pos; i++){
            int first = arr[0];
            for(int j=0; j<n-1; j++){
                arr[j] = arr[j+1];
            }
            arr[n-1] = first;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        rotate_left(arr, 2);
        print(arr);
    }
}

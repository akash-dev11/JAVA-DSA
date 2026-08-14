package Arrays4.Medium;

// Problem present on leetcode and GFG

public class RotateArray {
    // Print array
    static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void rotate(int arr[],int pos){
        int n = arr.length;
        pos = pos%n;
        for(int i=0; i<pos; i++){
            int last = arr[n-1];
            for(int j=n-1; j>0; j--){
                arr[j] = arr[j-1];
            }
            arr[0] = last;
        }
    }
    public static void main(String[] args) {
    
        int arr[] = {1,2,3,4,5,6};
        rotate(arr, 2);
        print(arr);
    }
}

package Basic;

public class RemoveAtGivenPos {
    static void remove(int arr[],int index){
        int n = arr.length-1;
        for(int i=index; i<n; i++){
            arr[i] = arr[i+1];
        }
        print(arr,n);
    }
    static void print(int arr[],int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int index = 2;
        remove(arr, index);
    }
}

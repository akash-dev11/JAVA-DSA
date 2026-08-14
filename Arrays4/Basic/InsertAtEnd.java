package Basic;

public class InsertAtEnd {
    static void insert(int arr[],int value){
        int n  = arr.length-1;
        arr[n] = value;
    }

    static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,0};
        insert(arr, 34);
        print(arr);

    }
}

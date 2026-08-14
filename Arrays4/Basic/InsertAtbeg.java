package Basic;

public class InsertAtbeg {
    static void Traverse(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void Insertion(int arr[],int value){
        int n = arr.length-1;
        for(int i=n-1; i>=0; i--){
            arr[i+1] = arr[i];
        }
        arr[0] = value;
    }
    public static void main(String[] args) {
    // Insertion Element on the beggning    
        int arr[] = {1,2,3,4,5,6,0};
        int value = 10;
        Insertion(arr, value);
        Traverse(arr);

    }
}

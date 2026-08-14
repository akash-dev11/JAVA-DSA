package Basic;

public class InsertGivenPosition {
    static void insert(int arr[],int index ,int value){
        for(int i=arr.length-1; i>index; i--){
            arr[i] = arr[i-1];
        }
        arr[index] = value;
    }
    static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,0};
        insert(arr,3,34);
        print(arr);
    }
}

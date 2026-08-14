package Basic;

public class RemoveFromEnd {
    static void remove(int arr[]){
        int n = arr.length-1;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        remove(arr);
    }
}

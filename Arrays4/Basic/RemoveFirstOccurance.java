package Basic;

public class RemoveFirstOccurance {
    static void remove(int arr[],int key){
        int n = arr.length;
        int index = -1;
        for(int i=0; i<n; i++){
            if(arr[i]==key){
                index = i;
                break;
            }
        }
        if(index==-1){
            System.out.println("key not present in array");
        }
        for(int i=index; i<n-1; i++){
            arr[i]=arr[i+1];
        }
    }
    static void print(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {10,20,20,30,40};
        int key = 20;
        remove(arr, key);
        print(arr);

    }
}

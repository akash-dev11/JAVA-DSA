package Arrays4.Easy;


public class MoveZero {
    static void bruteForce(int arr[]){
        int n= arr.length;
        int tem[] = new int[n];
        int index =0;
        for(int i=0; i<n; i++){
            if(arr[i]!=0){
                tem[index] = arr[i];
                index++;
            }
        }
        for(int i=0; i<n; i++){
            arr[i] = tem[i];
        }
    }

    static void Optimal(int arr[]){
        int n =arr.length;
        int j=-1;
        for(int i=0; i<n; i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1){
            return;
        }
        for(int i=j+1; i<n; i++){
            if(arr[i]!=0){
                int tem = arr[i];
                arr[i] = arr[j];
                arr[j] = tem;
                j++;
            }
        
        }

    }

    static void println(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {0,1,2,4,0,4,5,0};
        // bruteForce(arr);
        Optimal(arr);
        println(arr);
    }
}

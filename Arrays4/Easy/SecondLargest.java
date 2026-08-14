package Easy;

public class SecondLargest {
    static int Second(int arr[]){
        int largest  = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        int second = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>second && arr[i]<largest){
                second = arr[i];
            }
        }
        
        return second == Integer.MIN_VALUE?-1:second;
    }

    static int Method2(int arr[]){
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                second = largest;
                largest = arr[i];
            }
            else if(arr[i]>second && arr[i]<largest){
                second = arr[i];
            }
        }
        return second==Integer.MIN_VALUE?-1:second;
    }
    public static void main(String[] args) {
        int arr[] = {12,35,1,10,34,1};
        System.out.println(Second(arr));
        System.out.println(Method2(arr));
        
    }
    
}

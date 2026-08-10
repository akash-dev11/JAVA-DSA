package Sorting5.InPlaceSorting;

// Insertion => is like arranging playing cards in your hand. You take one element at a time 
// and insert it into its correct position among the elements that are already sorted.
public class insertion {

    static void sort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int crr =arr[i];
            int prev = i-1;
            while(prev>=0 && arr[prev]>crr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = crr;
        }
    }
    public static void main(String[] args){
        int arr[] = {4,5,3,2,1};
        sort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}

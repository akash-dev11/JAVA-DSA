package Sorting5.InPlace;

public class SelectionSort {
    public static void Sort(int arr[]){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int min = i;
            for(int j=i+1; j<n; j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            int tem = arr[min];
            arr[min] = arr[i];
            arr[i] = tem;
        }
    }
    public static void main(String[] args){
        int arr[] = {5,4,1,3,2};
        Sort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}

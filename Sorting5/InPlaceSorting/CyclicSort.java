package Sorting5.InPlaceSorting;

public class CyclicSort {
    public static void sort(int arr[]){
        int i=0;
        int end = arr.length;
        while(i<end){
            int index = arr[i]-1;
            if(arr[i]!=arr[index]){
                int tem = arr[i];
                arr[i] = arr[index];
                arr[index] = tem;
            }
            else{
                i++;
            } 
        }
    }
    public static void main(String[] args){
        int arr[] = {3,5,2,1,4};
        sort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}

package Sorting5;
public class CountingSort {

    public static void Sort(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            max  = Math.max(max, arr[i]);
        }
        int count[] = new int[max+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        // Sorting part
        int j =0;
        for(int i=0; i<arr.length; i++){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String[] args){
        int arr[] = {1,4,1,3,2,4,3,7};
        Sort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}

package Sorting5.InPlace;

public class CyclicSort {
    public static int Missing_number(int arr[]){
        int i = 0;
        int end = arr.length;
        while(i<end){
            int correct = arr[i];
            if(arr[i]<end && arr[i] != arr[correct]){
                int tem = arr[i];
                arr[i] = arr[correct];
                arr[correct] = tem;
            }
            else{
                i++;
            }
        }
        for(int start=0; start<arr.length; start++){
            if(arr[start]!=start){
                return start;
            }

        }
        return arr.length;
    }
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

        int arr1[] = {2,0,1};
        System.out.println(Missing_number(arr1));
    }
}

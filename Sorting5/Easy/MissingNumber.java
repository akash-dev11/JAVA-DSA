package Sorting5.Easy;

public class MissingNumber {
    static int sort(int arr[]){
        int i =0;
        int end = arr.length;
        while(i<end){
            int index = arr[i];
            if(arr[i]<end &&  arr[i]!=arr[index]){
                swap(arr,i,index);
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
        return end+1;
    }
    static void swap(int arr[],int start,int end){
        int tem = arr[start];
        arr[start] = arr[end];
        arr[end] = tem;
    }
    public static void main(String[] args){
        int arr[] = {1,0,3,4,2,6};
        System.out.println(sort(arr));

    }
}

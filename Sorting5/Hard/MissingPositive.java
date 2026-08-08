package Sorting5.Hard;
// Leetcode 41 problem number

public class MissingPositive {
    static int Missing(int arr[]){
        int i = 0;
        int end = arr.length;
        while(i<end){
            int index = arr[i]-1;
            if(arr[i]>0 && arr[i]<end && arr[i]!=arr[index]){
                swap(arr,i,index);
            }
            else{
                i++;
            }
        }
        for(int start=0; start<end; start++){
            if(arr[start]!=start+1){
                return start+1;
            }
        }
        return end+1;
    }
    static void swap(int arr[],int i,int index){
        int tem = arr[i];
        arr[i] = arr[index];
        arr[index] = tem;
    }
    public static void main(String[] args) {
        int arr[] = {3,4,-1,1};
        System.out.println(Missing(arr));
    }
}

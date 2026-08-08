package Sorting5.Medium;

// 287 problem number on leetcode
public class Find_Duplicate {
    static int Duplicate(int arr[]){
        int i=0; 
        int end = arr.length;
        while(i<end){
            if(arr[i]!=i+1){
                int ind = arr[i]-1;
                if(arr[i]!=arr[ind]){
                    swap(arr,i,ind);
                }
                else{
                    return arr[i];
                }
            }
            else{
                i++;
            }
        }
        return -1;
        
    }
    static void swap(int arr[],int i,int ind){
        int tem = arr[i];
        arr[i] = arr[ind];
        arr[ind] = tem;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,4,2,2};
        System.out.println(Duplicate(arr));
    }
}

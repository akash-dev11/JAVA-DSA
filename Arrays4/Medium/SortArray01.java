package Arrays4.Medium;

public class SortArray01{
    static void bruteforce(int arr[]){
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                count0++;
            }
            if(arr[i]==1){
                count1++;
            }
            else{
                count2++;
            }
        }
        for(int i=0; i<count0; i++){
            arr[i] = 0;
        }
        for(int i=count0; i<count0+count1; i++){
            arr[i] = 1;
        }
        for(int i=count0+count1; i<arr.length; i++){
            arr[i] = 2;
        }
    }
    static void Optimal(int arr[]){
        int low =0, mid=0;
        int hight = arr.length-1;
        while(mid<=hight){
            if(arr[mid]==0){
                int tem = arr[low];
                arr[low] = arr[mid];
                arr[mid] = tem;
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                int tem = arr[mid];
                arr[mid] = arr[hight];
                arr[hight] = tem;
                hight--;
            }
        }
    }
    static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,1,0,0,2,1};
        // bruteforce(arr);
        Optimal(arr);
        print(arr);
    }
}

package BinarySearch.Easy;

public class Peak_value {
    public static int Peak_element(int arr[]){
        int s =0; 
        int e = arr.length-1;
        while(s<e){
            int m = s + (e-s)/2;
            if(arr[m]>arr[m+1]){
                e = m;
            }
            else{
                s  = m +1;
            }
        }
        return s;
    }


    public static void main(String[] args) {
        int arr[] = {2,3,4,5,4,3,2,1};
        System.out.println(Peak_element(arr));
    }
}

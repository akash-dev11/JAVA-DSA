package BinarySearch;

public class Increse {
    static int found(int num[],int target){
        int s = 0;
        int e = num.length-1;
        while(s<=e){
            int m = s + (e-s)/2;
            if(num[m]== target){
                return m;
            }
            if(target<num[m]){
                e = m-1;
            }
            else{
                s = m+1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7,8};
        System.out.println(found(arr,7));
    }
}

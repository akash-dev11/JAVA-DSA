package Bit_manipulation7;

public class Find_single {
    static int single(int arr[]){
        int sin = 0;
        for(int num :arr){
            sin ^=num;
        }
        return sin;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,3,4,2,6,4};
        System.out.println(single(arr));
    }
}

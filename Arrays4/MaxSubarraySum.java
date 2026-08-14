package Arrays4;

public class MaxSubarraySum {
    // Approach 1 : brute force
    static void Brute_force(int arr[]){
        int max = Integer.MIN_VALUE;
        int crrsum = 0;
        for(int i=0; i<arr.length; i++){
            
            for(int j=i; j<arr.length; j++){
                crrsum = 0;
                for(int k=i; k<=j; k++){
                    crrsum += arr[k];
                }
                if(crrsum>max){
                    max = crrsum;
                }
            }
        }
        System.out.println(max);
    }

    // Approach 2 : Prefix sum 
    static void Prefix_sum(int arr[]){
        int max = Integer.MIN_VALUE;
        int crr = 0;
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1; i<prefix.length; i++){
            prefix[i] = arr[i]+ prefix[i-1];
        }
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                crr = i==0?prefix[j]:prefix[j]-prefix[i-1];
                if(crr>max){
                    max = crr;
                }
            }
        }
        System.out.println(max);
    }

    // Approach 3 : Kadan's algorithm 
    static void Kadan_sum(int arr[]){
        int max = Integer.MIN_VALUE;
        int crr = 0;
        for(int i=0; i<arr.length; i++){
            crr = crr+ arr[i];
            if(crr<0){
                crr=0;
            }
            if(max<crr){
                max = crr;
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        Brute_force(arr);
        Prefix_sum(arr);

        int arr1[]  = {-2,-3,4,-1,-2,1,5,-3};
        Kadan_sum(arr1);
    }
}

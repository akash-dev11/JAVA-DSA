package Arrays4.Easy;

public class StockBuy {
    static void Brute_force(int arr[]){
        int profit = 0;
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                profit = Math.max(profit,arr[j]-arr[i]);
            }
        }
        System.out.println(profit);
    }

    static void optimal(int arr[]){
        int min = arr[0];
        int max = 0;
        for(int i=1; i<arr.length; i++){
            min = Math.min(min,arr[i]);
            max = Math.max(max, arr[i]-min);
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int arr[] = {7,10,1,3,6,9,2};
        Brute_force(arr);
        optimal(arr);

    }
}

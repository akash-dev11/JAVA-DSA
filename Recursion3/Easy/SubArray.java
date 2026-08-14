package Easy;

public class SubArray {
    static void print_sub_array(int arr[],int start,int end){
        if(start==arr.length){
            return;
        }

        for(int i=start; i<=end; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        if(end+1<arr.length){
            print_sub_array(arr, start, end+1);
        }
        else{
            // Next starting row
            print_sub_array(arr, start+1, start+1);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        print_sub_array(arr,0,0);
    }
}

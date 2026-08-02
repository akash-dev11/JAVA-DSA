public class HardProblem{
    public static int Minimum_index(int arr[],int target){
       for(int i=0; i<arr.length; i++){
           if(arr[i]==target){
               return i;
           }
       }
       return -1;

        
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,3,1};
        System.out.println(Minimum_index(arr, 3));

    }
}
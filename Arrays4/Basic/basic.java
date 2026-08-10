package Basic;
import java.util.Arrays;

public class basic {

// Question 5    
    public static boolean even(int num){
        int count =0;
        while(num>0){
            count++;
            num = num/10;
        }
        return count%2==0;
    }

// Question 4    
    public static int[] Search_in_2D(int matrix[][],int target){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

// Question 3    
    public static int  Minimum_num(int arr[]){
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
// Question 2
    public static int Search_char(String name , char target){
        for(int i=0; i<name.length(); i++){
            if(name.charAt(i)==target){
                return i;
            }
        }
        return -1;
    }

// Question 1
    public static int Linear_search(int arr[],int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
   
    // Question 1    
        int arr[] = {23,21,45,67,87};
        int x = Linear_search(arr, 67);
        System.out.println(x);

    // Question 2
        String name = "Akash";
        char target = 's';
        System.out.println(Search_char(name,target));

    // Queston 3
        System.out.println(Minimum_num(arr));

    // Question 4    
        int[][] matrix = {{12,23,44},{54,32,1,2},{65,43,34}};
        int target1 = 1;
        int ans[] = Search_in_2D(matrix, target1);
        System.out.println(Arrays.toString(ans));

    // Question 5    
        int arr1[] = {12,11,2,1234,5643};
        int evencount = 0;
        for(int i=0; i<arr1.length; i++){
            if(even(arr[i])){
                evencount++;
            }
        }
        System.out.println(evencount);

       


    }
}

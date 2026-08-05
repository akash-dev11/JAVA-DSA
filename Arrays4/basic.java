// import java.util.Arrays;

public class basic {

    public static int maximumWealth(int[][] accounts) {
        int sum = 0;
        int max = 0;
        for(int per=0;per<accounts.length; per++){
            sum =0;
            for(int acc = 0; acc<accounts[per].length; acc++){
                sum += accounts[per][acc];
                max = Math.max(max,sum);
            }
        }
        return max;
    }

    public static boolean even(int num){
        int count =0;
        while(num>0){
            count++;
            num = num/10;
        }
        return count%2==0;


    }

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

    public static int  Minimum_num(int arr[]){
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    public static int Search_char(String name , char target){
        for(int i=0; i<name.length(); i++){
            if(name.charAt(i)==target){
                return i;
            }
        }
        return -1;
    }

    public static int Linear_search(int arr[],int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[] = {23,21,45,67,87};
        int x = Linear_search(arr, 67);
        System.out.println(x);

        String name = "Akash";
        char target = 's';
        System.out.println(Search_char(name,target));

        System.out.println(Minimum_num(arr));

        int[][] matrix = {{12,23,44},{54,32,1,2},{65,43,34}};
        int target = 1;
        int ans[] = Search_in_2D(matrix, target);
        System.out.println(Arrays.toString(ans));

        int arr[] = {12,11,2,1234,5643};
        int evencount = 0;
        for(int i=0; i<arr.length; i++){
            if(even(arr[i])){
                evencount++;
            }
        }
        System.out.println(evencount);

        int[][] accounts = {{1,2,3},{1,0,2}};
        System.out.println(maximumWealth(accounts));



    }
}

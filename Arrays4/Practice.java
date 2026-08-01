import java.util.Arrays;

public class Practice {
    public static int Peak_index(int arr[]){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int mid = start + (end - start)/2;
            if(arr[mid] >arr[mid+1]){
                end = mid;
            }
            else{
                start = mid +1;
            }
        }
        return start;
    }


    public static int[] checkRange(int[] arr,int target){
        int ans[] = {-1,-1};
        int start = first_last(arr, target,true);
        int left = first_last(arr, target, false);
        ans[0] = start;
        ans[1] = left;
        return ans;
    }
    public static int first_last(int[] arr,int target,boolean checkLeftRigt){
        int start  =0;
        int end = arr.length-1;
        int ans = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]>target){
                end = mid-1;
            }
            else if(arr[mid]<target){
                start = mid+1;
            }
            else{
                ans = mid;
                if(checkLeftRigt){
                    end = mid -1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }


    public static char Smallest_letter(char letters[],char target){
        int start = 0;
        int end = letters.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(letters[mid]>target){
                end = mid -1;
            }
            else{
                start = mid + 1;
            }
        }
        return letters[start%letters.length];
    }

    public static int floor_number(int arr[],int target){
        // floor => 
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            
            if(target>arr[arr.length-1]){
                return -1;
            }
            if(arr[mid]<target){
                start = mid +1;
            }
            else if(arr[mid]>target){
                end = mid -1;
            }
            else{
                return mid;
            }
        }
        return end;
    }
    public static int ceilling_number(int arr[],int target){
        // Ceilling => Target se greater ya equal sabse chhota number.
         int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            
            if(arr[mid]<target){
                start = mid +1;
            }
            else if(arr[mid]>target){
                end = mid -1;
            }
            else{
                return mid;
            }
        }
        return start;
    }
    public static void main(String[] args){

    // first question    
        // int arr[] ={2,3,5,9,14,16,18};
        // System.out.println(ceilling_number(arr,15));
    // Second question
        // System.out.println(floor_number(arr,15));
    
    // Third question
        // char letters[] = {'c','f','j'};
        // char target = 'a';
        // System.out.println(Smallest_letter(letters, target));
    
    // fourth question
        // int arr[] = {5,7,7,8,8,10};
        // int target  = 8;
        // System.out.println(Arrays.toString(checkRange(arr, target)));

    // fiveth
        int arr[] = {1,2,3,5,7,6,3,2};
        System.out.println(Peak_index(arr));    
    }
}

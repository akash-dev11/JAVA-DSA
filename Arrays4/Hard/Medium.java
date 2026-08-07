package Hard;
public class Medium {

    public static int findPivot(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(start<mid && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[start]<arr[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }

    public static int Binary_search(int arr[] ,int target,int start,int end){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]>target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }

    public static int Search(int arr[],int target){
        int pivot = findPivot(arr);
        if(pivot == -1){
            return Binary_search(arr, target, 0, arr.length-1);
        }
        if(arr[pivot]==target){
            return pivot;
        }
        if(target>=arr[0]){
            return Binary_search(arr, target, 0, pivot-1);
        }
        return Binary_search(arr, target,pivot+1,arr.length-1);
    }
    public static void main(String[] args){
        int arr[] = {4,5,6,7,0,1,2};
        int target = 1;
        // int x = findPivot(arr);
        System.out.println(Search(arr, target));
    }
    
    
}

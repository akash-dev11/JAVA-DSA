import java.util.ArrayList;

public class RecursionArray {


    static boolean sorted_Array(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        return (arr[i]<arr[i+1])&&(sorted_Array(arr, i+1));
    }

    static boolean Linear_Search(int arr[],int target,int index){
        if(index==arr.length){
            return false;
        }
        return (arr[index]==target) || Linear_Search(arr, target, index+1);
    }

    static int Linear_index(int arr[],int target,int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return Linear_index(arr, target, index+1);
    }

    static ArrayList<Integer> Linear_List(int arr[],int target,int index,ArrayList<Integer> list){

        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return Linear_List(arr, target, index+1,list);
    }

    static int search_rotate_binary(int arr[],int target,int s,int e){
        if(s>e){
            return -1;
        }
        int m = s + (e-s)/2;
        if(arr[m]==target){
            return m;
        }
        if(arr[s]<arr[m]){
            if(target>=arr[s] && target<=arr[m]){
                return search_rotate_binary(arr, target, 0, m-1);
            }
            else{
                return search_rotate_binary(arr, target, m+1, e);
            }
        }
        if(target>=arr[m] && target<=arr[e]){
            return search_rotate_binary(arr, target, m+1, e);
        }
        return search_rotate_binary(arr, target, s, m-1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,6,0};
        System.out.println(sorted_Array(arr,0));

        int arr1[] = {43,21,4,36,65};
        System.out.println(Linear_Search(arr1, 0, 0));

        int arr2[] = {43,21,4,36,65};
        System.out.println(Linear_index(arr2, 211, 0));
        int arr3[] = {1,2,3,4,5,5,6,7};
        System.out.println(Linear_List(arr3, 5, 0, new ArrayList<Integer>()));

        int arr4[] = {5,6,7,8,9,1,2,3};
        System.out.println(search_rotate_binary(arr4, 1, 0, arr4.length-1));

    }
    
}

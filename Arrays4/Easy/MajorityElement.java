package Arrays4.Easy;

public class MajorityElement {

//  Brute force approach
    static int MaximumOccur(int arr[]){
        for(int i=0; i<arr.length; i++){
            int count =0;
            for(int j=0; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    count++;
                    if(arr.length/2<count){
                        return arr[i];
                    }
                }
            }
        }
        return -1;
    }

    static int Second(int arr[]){
        int el =0;
        int count =0;
        for(int i=0; i<arr.length; i++){
            if(count==0){
                el=arr[i];
                count=1;
            }
            else if(arr[i]==el){
                count++;
            }
            else{
                count--;
            }
        }
        int c = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==el){
                c++;
            }
        }
        if(c>arr.length/2){
            return el;
        }
        return -1;
    }

// Optimal approach
    public static void main(String[] args) {
        int arr[] = {2,2,3,3,1,2,2};
        int arr1[] = {2,2,3,3,1,2,2};
        System.out.println(MaximumOccur(arr));
        System.out.println(Second(arr1));
    }
}

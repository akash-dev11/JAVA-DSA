package Easy;

// 1295 problem number on leetcode
public class Find_Number_EvenDigit {
    static int count(int n){
        int c = 0;
        while(n>0){
            n = n/10;
            c++;
        }
        return c;
    }
    public static void main(String[] args) {
        int nums[] = {12,345,2,34,45,6,7896};
        int evenCount = 0;
        for(int i=0; i<nums.length; i++){
            if(count(nums[i])%2==0){
                evenCount++;
            }
        }
        System.out.println(evenCount);

    }
}




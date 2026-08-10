package Easy;

// 1672 problem number on leetcode 
public class MaximumWealth {
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
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{1,0,2}};
        System.out.println(maximumWealth(accounts));

    }
}

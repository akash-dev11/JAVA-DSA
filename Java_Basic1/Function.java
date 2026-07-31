public class Function {
    public static int reverse(int x){
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        int rev = 0;
        while(x!=0){
            int rem = x%10;
            x = x/10;
            if(rev>max/10 || (rev == max/10 && max>7)){
                return 0;
            }
            if(rev<min/10 || (rev == min/10 && min<-8)){
                return 0;
            }

            rev = rev*10 + rem;
        }
        return rev;
    }
    public static void main(String[] args){
        System.out.println(reverse(1552546758));
    }
}

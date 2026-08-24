package Bit_manipulation7;

public class Odd_even {
    static String odd_even(int n){
        if((n&1)==1){
            return  "odd";
        }
        return "even";

    }
    public static void main(String[] args) {
        System.out.println(odd_even(11));
    }
}

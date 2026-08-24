package Bit_manipulation7;

public class NoOfDigit {
    public static void main(String[] args) {
        int number = 10;
        int binary = 2;

        int ans = (int)(Math.log(number)/ Math.log(binary)) + 1;
        System.out.println(ans);
    }
}



public class Basic {
    
    public static int binarySearch(int[] arr, int target, int start, int end) {

        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (target < arr[mid]) {
            return binarySearch(arr, target, start, mid - 1);
        }

        return binarySearch(arr, target, mid + 1, end);
    }

    public static int fibo(int n){
        // base condition
        if(n<2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }

    public static void print(int n){
        if(n==5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n+1);
    }

    public static void printN1(int n){
        // base condition
        if(n<1){
            return;
        }
        System.out.println(n);
        printN1(n-1);
    }

    public static int factorial(int n){
        // base condition 
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);  // and doing sum of number
    }

    public static int sumOfdigit(int n){
        // Base condition
        if(n ==0){
            return 0;
        }
        return n%10 + sumOfdigit(n/10);  // do product of digits
    }

    public static void concept(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        // concept(n--);
        concept(--n);
    }

    static int sum = 0;
    public static void rev1(int n){
        if(n==0){
            return ;
        }
        int rem = n%10;
        sum = sum*10 + rem;
        rev1(n/10);
    }

    public static int rev2(int n){
        int digit = (int)(Math.log10(n)) + 1;
        return helper(n,digit);
    }
    public static int helper(int n,int digit){
        if(n%10 == n){
            return n;
        }
        int rem = n%10;
        return rem*(int)(Math.pow(10,digit-1)) +    helper(n/10, digit-1);
    }

    static boolean palindromeNumber(int n){
        return n == rev2(n);
    }


    public static int countZero(int n){
        return help(n,0);
    }

    static int help(int n,int c){
        if(n==0){
            return c;
        }
        int rem = n%10;
        if(rem == 0){
            return help(n/10, c+1);
        }
        else{
            return help(n/10, c);
        }
    }
    public static void main(String[] args){
        System.out.println("print number 1 to N");
        print(1);

        System.out.println("Sum of nth number of fibonachhi:");
        System.out.println(fibo(5));


        int[] arr = {2, 5, 8, 12, 16, 23, 38};
        int target = 16;
        System.out.println("Binary search :");
        System.out.println(binarySearch(arr, target, 0, arr.length-1));

        System.out.println("print N to 1 :");
        printN1(5);

        System.out.println("factorial of n : "+factorial(5));

        System.out.println("Sum of digits :"+sumOfdigit(1342));

        System.out.println("help full concept");
        concept(5);

        System.out.println("reverse a number method 1 :");
        rev1(123);
        System.out.println(sum);

        System.out.println("reverse a number method 2 :");
        System.out.println(rev2(1234));

        System.out.println(palindromeNumber(1211));

        System.out.println(countZero(1203002034));
    }
}

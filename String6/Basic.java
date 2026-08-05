import java.util.ArrayList;
import java.util.Arrays;

public class Basic {
    public static void main(String[] args){
    // Immutable     
        String name = "Akash";
        System.out.println(name);
        name = "kumar";
        System.out.println(name);

    // == methods
        String a = "Akash";
        String b = "Akash";
        System.out.println(a==b);

    // same value with diff object
        String name1 = new String("Akash");
        String last  = new String("Akash");
        System.out.println(name1==last);
        System.out.println(name1.equals(last));

    // Pretty print in java
       float c = 234.23443f;
       System.out.printf("floated number %.2f",c);
       System.out.println();
       System.out.printf("Hello everyone my name is %s and I am an %s in Google" ,"Akash kumar","Software Engineer ");
       System.out.println();

    // String Operator
       System.out.println('a'+'b');
       System.out.println("a"+"b");
       System.out.println('a'+3);
       System.out.println((char)('a'+3));
       System.out.println("a"+3);  // Integer will be converted to Integer that will call toString()
       System.out.println("Akash"+new ArrayList<>());
       System.out.println("Akash"+ new Integer(45));
       String ans = new Integer(45) + "" + new ArrayList<>();
       System.out.println(ans);

    // String performance 
       String series = "";
       for(int i=0; i<26; i++){
            char ch = (char)('a'+i);
            series +=ch;
        }
        System.out.println(series);

    // StringBuilder 
        StringBuilder builder = new StringBuilder();
        for(int i=0; i<26; i++){
            char ch = (char)('a'+i);
            builder.append(ch);
        }
        System.out.println(builder);
        System.out.println(builder.deleteCharAt(1));

    // String methods
        String dogi = "Rony tony";
        System.out.println(Arrays.toString(dogi.toCharArray()));
        System.out.println(dogi.toLowerCase());
        System.out.println(dogi.toUpperCase());
        System.out.println(dogi.indexOf('o'));
        System.out.println(dogi.strip());
        System.out.println(Arrays.toString(dogi.split(" ")));




    }
}

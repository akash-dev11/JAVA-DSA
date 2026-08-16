public class Concatenation {

    static void Join(String s1,String s2){
        StringBuilder newStr = new StringBuilder();
        for(char ch : s1.toCharArray()){
            newStr.append(ch);
        }
        for(char ch : s2.toCharArray()){
            newStr.append(ch);
        }

        System.out.println(newStr);
    }
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        Join(s1, s2);

    }
}

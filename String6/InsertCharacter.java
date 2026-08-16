public class InsertCharacter {
    static void insert(String name,char ch){
        StringBuilder newStr = new StringBuilder(name);
        newStr.insert(2,ch);
        System.out.println(newStr);
    }

    static void insert_second(String name,char ch,int pos){
        StringBuilder newStr = new StringBuilder();
        for(int i=0; i<name.length(); i++){
            if(i==pos){
                newStr.append(ch);
            }
            newStr.append(name.charAt(i));
        }
        System.out.println(newStr);
    }
    public static void main(String[] args) {
        String name = "Aksh";
        char ch = 'a';
        insert(name,ch);
        insert_second(name, ch, 2);
    }
}

public class Deletion {

    static void Deletion(String name,int pos){
        StringBuilder newStr = new StringBuilder(name);
        newStr.deleteCharAt(pos);
        System.out.println(newStr);
    }
    static void Deletion_second(String name, int post){
        StringBuilder newStr = new StringBuilder();
        for(int i=0; i<name.length(); i++){
            if(i != post){
                newStr.append(name.charAt(i));
            }
        }
        System.out.println(newStr);
    }
    public static void main(String[] args) {
        String name = "Akaash";
        int pos = 2;
        Deletion(name, pos);
        Deletion_second(name, pos);

    }
}

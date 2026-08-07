public class SearchingInString {

    static boolean search(String name,char target){
        for(int i=0; i<name.length(); i++){
            if(target == name.charAt(i)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String name = "Akash";
        char target = 'K';
        boolean ans = search(name, target);
        System.out.println(ans);

    }
}

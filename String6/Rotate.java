public class Rotate {

    static void rotate(String name,int d){
        int n = name.length();
        char[] arr = name.toCharArray();
        for(int i=0; i<d; i++){
            char first = name.charAt(i);
            for(int j=0; j<n-1; j++){
                arr[j] = arr[j+1];
            }
            arr[n-1] = first;
        }
        System.out.println(arr);
    }
    public static void main(String[] args) {
        String name = "shaka";
        int d = 2;
        rotate(name, d);

    }
}

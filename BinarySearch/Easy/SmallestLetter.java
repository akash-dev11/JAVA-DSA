package BinarySearch.Easy;

public class SmallestLetter {
     public static char Smallest_letter(char letters[],char target){
        int start = 0;
        int end = letters.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(letters[mid]>target){
                end = mid -1;
            }
            else{
                start = mid + 1;
            }
        }
        return letters[start%letters.length];
    }

    public static void main(String[] args) {
        char letters[] = {'c','f','j'};
        char target = 'a';
        System.out.println(Smallest_letter(letters, target));
    }

    
}

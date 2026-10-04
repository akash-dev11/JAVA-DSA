package Hashmap12.AP;

import java.util.HashSet;

public class UnionAndIntersection {
    public static void main(String[] args) {
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};
        HashSet<Integer> set = new HashSet<>();

        // Union
        System.out.print("Union :");
        for(int arr: arr1){
            set.add(arr);
        }
        for(int arr: arr2){
            set.add(arr);
        }
        System.out.print(set+" ");
        System.out.println();

        set.clear();

        // Intersection
        System.out.print("Intersection :");
        for(int arr: arr1){
            set.add(arr);
        }
        for(int arr: arr2){
            if(set.contains(arr)){
                System.out.print(arr+" ");
                set.remove(arr);
            }
        }


    }
}

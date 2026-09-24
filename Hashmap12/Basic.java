package Hashmap12;

import java.util.HashSet;
import java.util.TreeSet;

public class Basic {
    public static void main(String[] args) {
        // HashSet<Integer> set = new HashSet<>();
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        System.out.println(set.size());
        System.out.println(set.contains(20));
        set.remove(10);
        set.add(50);
        System.out.println(set);
    }
}

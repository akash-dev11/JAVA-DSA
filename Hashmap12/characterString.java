package Hashmap12;

import java.util.*;

public class characterString {
    public static void main(String[] args) {
        String s = "abcdabehf";
        // Hash array
        int[] hash = new int[256];
        // Pre-compute frequency
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i)]++;
        }
        // Queries
        char[] queries = {'a', 'g', 'h', 'b', 'c'};

        for (char c : queries) {
            System.out.println(hash[c]);
        }
    }
} 


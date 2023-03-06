package org.example;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] tab1 = {1,2,3,1};
        int[] tab2 = {1,2,3,4};
        int[] tab3 = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(tab3));
    }

    private static boolean containsDuplicate(int[] nums){
        Set<Integer> integerSet = new HashSet<>();
        for(int i : nums) {
            if (!integerSet.contains(i)){
                integerSet.add(i);
            }else {
                return true;
            }
        }
        return false;
    }
}
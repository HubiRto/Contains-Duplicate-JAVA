package org.example;

import java.util.HashSet;
import java.util.Set;

public class Main {
    private boolean containsDuplicate(int[] nums){
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
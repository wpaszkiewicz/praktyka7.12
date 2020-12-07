package com.infoshare;

import java.util.Arrays;
import java.util.HashMap;

public class ArrayUtils {

    public static int secondHighest(int[] intTab) throws IllegalArgumentException{
        if(intTab == null){
            throw new IllegalArgumentException("Input cannot be null.");
        }
        Arrays.sort(intTab);
        for(int i = intTab.length - 2; i >= 0; i--){
            if(intTab[i] < intTab[intTab.length - 1]){
                return intTab[i];
            }
        }
        throw new IllegalArgumentException("Wrong input");
    }
    public static int secondHighestKey(HashMap<Integer, String> map){
        int[] mapKeys = new int[map.size()];
        int i = 0;
        for(Integer key : map.keySet()){
            mapKeys[i] = key;
            i++;
        }
        return secondHighest(mapKeys);
    }
}

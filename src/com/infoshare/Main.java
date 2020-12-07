package com.infoshare;

import java.util.HashMap;

public class Main {

    public static void main(String[] args){
        int[] intTab = {1, 2, 5, 4 ,3};
        int[] intTab2 = {6};
        int[] intTab3 = {50, 50, 20, 10};
        int[] intTab4 = {7, 7, 7, 7, 7};

//        System.out.println(ArrayUtils.secondHighest(null));
        System.out.println(ArrayUtils.secondHighest(intTab));
//        System.out.println(ArrayUtils.secondHighest(intTab2));
        System.out.println(ArrayUtils.secondHighest(intTab3));
//        System.out.println(ArrayUtils.secondHighest(intTab4));

        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(124, "First");
        map1.put(126, "Second");
        map1.put(127, "Third");
        map1.put(123, "Fourth");
        map1.put(125, "Fifth");

        System.out.println(ArrayUtils.secondHighestKey(map1));






    }
	// write your code here

}

package com.Prashant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Supplier;


public class Main {

    public static void main(String[] args) {
	// write your code here
        final List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8);
        //Using Lambda Expression
        copyElements(list,()->new ArrayList<Integer>());
        //Using Method Reference
        copyElements(list,ArrayList::new);
    }
    private static void copyElements(final List<Integer> list, final Supplier<Collection<Integer>>target){
        list.forEach(target.get()::add);
        System.out.println(list);
    }
}

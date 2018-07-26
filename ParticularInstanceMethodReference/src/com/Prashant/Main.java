package com.Prashant;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        final List<Integer> list= Arrays.asList(1,2,3,9,3,5,8);
        final MyComparator myComparator=new MyComparator();

        //using Lambda Expressions
        Collections.sort(list,(a,b)->myComparator.compare(a,b));
        System.out.println(list);

        //using Method Reference
        Collections.sort(list,myComparator::compare);
        System.out.println(list);
    }
}

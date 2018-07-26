package com.Prashant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9);
        //using Method Reference
        System.out.println("Using Method Reference");
        list.forEach(Main::print);

        //Using Lambda Expression
        System.out.println("Using Lambda Expression");
        list.forEach(number->Main.print(number));

        //Normal Way
        System.out.println("Normal Way ");
        for(int number:list){
            Main.print(number);
        }
    }

    private static void print(Integer integer) {
        System.out.println("Number:"+integer);
    }
}

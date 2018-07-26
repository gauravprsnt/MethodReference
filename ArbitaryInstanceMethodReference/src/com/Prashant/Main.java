package com.Prashant;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Person> personList= Arrays.asList(new Person("Prashant"),new Person("Gaurav"),
                new Person("Nabin"),new Person("Pokharel"));
        //Using Lambda Expression
        personList.forEach(person -> person.printName());

        //Using Method Reference
        personList.forEach(Person::printName);
    }
}

package com.company;

import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer>  numbers= List.of(1,2,3,4,102934,234,1,2,3,54,342,12,5,34,123);
        Iterator<Integer> iterator = numbers.iterator();
        //iterator.forEachRemaining(i-> {if(i>5) System.out.println(i);});
        iterator.forEachRemaining(i-> System.out.println(i));
    }
}

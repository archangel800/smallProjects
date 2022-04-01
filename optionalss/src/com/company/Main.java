package com.company;

import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        // We Can Create Optional in three ways
        //first
    Optional<Integer> integerValue = Optional.empty();
    //second
        //This will Create an optional with the value of 23
        Optional<Integer> intValue = Optional.of(23);

        //the third
        //If we suspect that we might get the null value we should use ofNullable
        //otherwise we will get exception of type NoSuchElementException, when we use get method
        Optional<Integer> intValu2 = Optional.ofNullable(null);


        //how to get optional
        //if we use null as a return type, and we invoke get method we are going to get NoSuchElementException
        // in order to get rid of this exception we should first check against null
        if(intValu2.isPresent()){
            System.out.println(intValu2.get());
        }
        else{
            System.out.println("No value");
        }
        //we have other way to do this
        //if we get null, it is going to set that value to 50
        System.out.println(intValu2.orElse(50));

        //we have other way to, if we want to use an expression
        System.out.println(intValu2.orElseGet(()-> 90));

        //we can throw an exception if we get null value
        try {
            System.out.println(intValu2.orElseThrow(() -> new RuntimeException("Not Applicable")));
        }
        catch (RuntimeException ex){
            ex.printStackTrace();
        }

        //how to do operations on the fly

        System.out.println(intValue.map(i->i+50).orElseGet(()->55));

        //how to filter optionals

        System.out.println(intValue.filter(i->i==24).orElseGet(()->9999));

        //how to check optionals easily if an actual value is present

        intValue.ifPresent(value-> System.out.println(value));

        intValue.ifPresentOrElse(value-> System.out.println(value),()->{
            System.out.println("Value is not present");
        } );

        // how to check if it is empty
        System.out.println(intValu2.isEmpty());

        //
        Optional<Person> person = number(2);

        if(person.isPresent()){{
            System.out.println(person);
        }}



    }

    public static Optional<Person> number(int position){
        Optional<Person> person = Optional.empty();

        var personList = List.of(new Person("Daniel", 12),new Person("David", 11)
                , new Person("Jack", 30));
        if(position>=0&& position <personList.size()){
            person = Optional.of(personList.get(position));
        }
        return person;

    }
}

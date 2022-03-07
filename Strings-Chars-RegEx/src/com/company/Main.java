package com.company;

public class Main {

    public static void main(String[] args) {
    //idnexOf
        String letters ="asdjkfasl;dkfjas;ldfkj2345$#)def(lkasdjf;laskdjf";
        //if the character is not present it returns -1
        System.out.printf("'c' is located at index %d%n", letters.indexOf('l'));
        System.out.printf("'k' is located at index %d%n", letters.indexOf('k', 5));

        System.out.printf("Last 'a' is located at index %d%n", letters.lastIndexOf('a'));

        System.out.printf(" \"def\" is located at index %d%n", letters.indexOf("de"));
    }
}

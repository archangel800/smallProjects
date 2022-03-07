package com.company;

public class Main {

    public static void main(String[] args) {
//       char [] charArray = {'b','i','r','t','h',' ','d','a','y'};
//        String s = new String("hello");
//        String s1 = new String();
//        String s2 = new String(s);
//        String s3 = new String(charArray);
//        String s4 = new String(charArray, 6,3);
//
//        System.out.printf("s1= %s%ns2 = %s%ns3 = %s%ns4 = $s$n", s1, s2, s3, s4);

        //Reversing the string using charAt Function
        String s1 = "Howdy My name is George";
        for(int i = s1.length()-1;i>=0;i--){
            System.out.printf("%c ",s1.charAt(i));
        }
        //copy characters from string into charArray
        System.out.println();
        System.out.println("Getting the chars out of string");
        char [] arr = new char[5];
        s1.getChars(0,5,arr, 0);
        for (char item : arr
             ) {
            System.out.print(item);
        }
    }
}

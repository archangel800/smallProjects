package com.company;

public class Main {

    public static void main(String[] args) {
   //concatenating is the same as using + operator
        //it returns new String object containing the characters from both original Strings.

        String s1 = "Happy ";
        String s2 = "Birthday";
        System.out.printf("s1 = %s%ns2 = %s%n%n",s1, s2);

        System.out.printf("Result of s1.concat(s2) = %s%n", s1.concat(s2) );
        //s1 is not affected, because concat returns whole new object.
        System.out.printf("s1 after concatenation = %s%n", s1);

        String s3 = s1.concat(s2);
        System.out.println(s3);
    }
}

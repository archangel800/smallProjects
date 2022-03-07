package com.company;

public class Main {

    public static void main(String[] args) {
    //When the computer compares Strings, it actually compares the numeric codes of the characters in the Strings.
        String s1 = new String("hello");
        String s2 = "goodbye";
        String s3 = "Happy Birthday";
        String s4 = "happy birthday";
        System.out.printf("s1 = %s%ns2 = %s%ns3 = %s%ns4 = %s", s1, s2, s3, s4);

        if(s1.equals("hello")){ // true
            System.out.println("s1 equals \"hello\"");
        }
        else{
            System.out.println("s1 does not equal \"hello\"");
        }

        if(s1=="hello"){//this is false(different objects) because == compares objects rather than the content itself
            System.out.println("S1 is the same object as \"hello\"");
        }
        else{
            System.out.println("s1 is not the same object as \"hello\"");
        }

        //equals ignore case
        if(s3.equalsIgnoreCase(s4)){ //true
            System.out.println("%s equals %s with case ignored%n");
        }
        else{
            System.out.println("s3 does not equal s4");
        }
        //test compareto
        System.out.printf("%ns1.compareTo(s2) is %d", s1.compareTo(s2));
        System.out.printf("%ns2.compareTo(s1) is %d", s2.compareTo(s1));
        System.out.printf("%ns1.compareTo(s1) is %d", s1.compareTo(s1));
        System.out.printf("%ns3.compareTo(s4) is %d", s3.compareTo(s4));
        System.out.printf("%ns4.compareTo(s3) is %d", s4.compareTo(s3));

        //test regionMatches(case sensitive)
        if(s3.regionMatches(0, s4, 0, 5)){
            System.out.println("First 5 characters of s3 and s4 match");
        }
        else{
            System.out.println("First 4 characters of s3 and s4 do not match");
        }

        if(s3.regionMatches(true,0, s4, 0, 5)){
            System.out.println("First 5 characters of s3 and s4 match with case ignored");
        }
        else{
            System.out.println("First 5 characters of s3 and s4 do not match");
        }
        // equals measures if the contents of 2 strings are identical, it compares the integer Unicode values
        // == in this case we have used == to compare String s1 with literal "hello". When primitive-type values are compared with ==
        // the result is true if both values are identical. When refereces are compared with ==, the result is true if both references
        // refer to the same object in memory.
        //String compareto method compares numeric values of corresponding characters in each String

    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
       //In programs that frequently perform string concatenation, or other string modifications
        //it is often more efficient to implement the modifications with class StringBuilder
        //StringBuilder class is used for creating and manipulating dynamic strings.
        //StringBuilders are not thread safe. if multiple threads require access to the same dynamic string information
        //use StringBuffer instead. StringBuffer is thread save, with identical capabilities but it is little bit slower.
        Object objectRef = "hello";
        String string = "goodbye";
        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
        boolean booleanValue = true;
        char characterValue = 'Z';
        int integerValue = 7;
        long longValue = 10000000000L;
        float floatValue = 2.5f;
        double doubleValue = 33.333;
        StringBuilder lastBuffer = new StringBuilder("last buffer");
        StringBuilder buffer = new StringBuilder();
        buffer.append(objectRef).append(System.getProperty("line.separator")).append(string).append(System.getProperty("line.separator"))
                .append(charArray).append(System.getProperty("line.separator")).append(charArray, 0,3).append(System.getProperty("line.separator")).append("Modi aqa");
        String some =buffer.toString();
        System.out.println(some);

        //we can concatenate using StringBuilder
        String string1 = "Hello";
        String string2 = "BC";
        int value = 22;
        String s = new StringBuilder().append(string1).append(string2).append(value).toString();
        System.out.println(s);

    }
}

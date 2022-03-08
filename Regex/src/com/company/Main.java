package com.company;

public class Main {

    public static void main(String[] args) {

        String first = "This sentence ends in 5 stars *****";

        String second = "1, 2, 3, 4, 5, 6, 7, 8";
        System.out.printf("Original String 1: %s%n", first);
        first = first.replaceAll("\\*", "^");
        System.out.printf("Modified String 1: %s%n", first);

        first  = first.replace("stars", "carets");
        System.out.printf("Modified String 1: %s%n", first);

        first = first.replaceAll("\\w+", "word");
        System.out.printf("Modified String 1: %s%n", first);

        System.out.printf("Original String 2: %s%n", second);

        for(int i=0;i<3;i++){
            second = second.replaceFirst("\\d", "digit");
        }
        System.out.printf("Modified String 2: %s%n", second);



    }

}

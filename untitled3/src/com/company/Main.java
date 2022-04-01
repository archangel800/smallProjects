package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

    while(true){
        if(scan.hasNext()){
            int i = scan.nextInt();
            System.out.printf("%d is a number\n", i);

            if(i == -1){
                break;
            }
        }
    }

    }
}

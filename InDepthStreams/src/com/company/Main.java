package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println(reader.readLine());


        PrintWriter writer = new PrintWriter(file);
        for(int i =0;i<100;i++){
            writer.write(i);
        }
    }
}

package com.company;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {

        //For the real world programs, the recommended method of writing to the console when using java is throug a PrintWriter
        // PrintWriter is one of the character-based classes
        //PrintWriter(OutputStream outputStream, boolean flushingOn) flushingOn controls whether Java flushes the output stream every time a println() method
        // is summoned.
//
//        FileOutputStream fs = new FileOutputStream("someFiles.txt");
//        byte [] bytes = "giorgi magari kacia".getBytes(StandardCharsets.UTF_8);
//        fs.write(bytes);


        FileReader writer = new FileReader("someFiles.txt");
        BufferedReader reader = new BufferedReader(writer);
        int i  = 1;
    while(i!=-1){
        System.out.println(reader.readLine());
        i=reader.read();
    }
    writer.close();
    reader.close();


    }
}

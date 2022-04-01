package com.company;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        try(Formatter output = new Formatter("clients.txt")){
            Scanner input = new Scanner(System.in);
            System.out.printf("%s%n%s%n? ", "Enter account number, first name, last name and balance.", "Enter end-of-file indicator to end input.");
            while(input.hasNext()){
                try{
                    output.format("%d %s %s %.2f%n", input.nextInt(), input.next(), input.next(), input.nextDouble());
                }
                catch(NoSuchElementException elementException){
                    System.err.println("Invalid input. Please try again.");
                    input.nextLine(); // discard input so user can try again
                }
                System.out.println("? ");
            }
    }
        catch(SecurityException | FileNotFoundException | FormatterClosedException e){
            e.printStackTrace();
        }
    }
}

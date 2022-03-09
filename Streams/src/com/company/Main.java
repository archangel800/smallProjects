package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    //Reading from text file
    public static void main(String[] args) throws IOException {
       try(Scanner sc = new Scanner(Paths.get("clients.txt")))
       {
           System.out.printf("%-10s%-12s%-12s%14s%n", "Account", "First Name", "Last Name", "Balance");
           while(sc.hasNext()){
               System.out.printf("%-10d%-12s%-12s%14f%n", sc.nextInt(), sc.next(), sc.next(), sc.nextDouble());
           }
       }
       catch(IOException | IllegalStateException | NoSuchElementException ex){
           ex.printStackTrace();
       }

    }
}

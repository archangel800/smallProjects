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

    public static void main(String[] args) throws IOException {

        // SecurityException that occurs if the user does not have permission to write data to the file opened in line
        // FileNotFoundException that occurs if the file does not exist and a new file cannot be created, or if there's an error opening the file
        // FormatterClosedException that occurs if the Formatter object is closed when you attempt to use it in lines 22-23 to write into a file.
        // NoSuchElementException  - Scanner throws this exception if it could not manage to find proper element, for example we have input.nextInt() for the first character
        // if the character is different from int it is going to throw this exception. for that we have catch clause which tells us to try again and input.nextLine() is going to skip the line and go to the next line.
        try( Formatter formatter = new Formatter("clients.txt")){
            Scanner input = new Scanner(System.in);
            System.out.printf("%s%n%s%n? ", "Enter account number, first name, last name, and balance", "Enter end-of-file indicator to end input.");

            while(input.hasNext()) {
                try {
                    formatter.format("%d %s %s %.2f%n", input.nextInt(), input.next(), input.next(), input.nextDouble());
                } catch (NoSuchElementException ex) {
                    System.err.println("Invalid input. Please try again...");
                    input.nextLine();
                }
                System.out.print("? ");
            }
        }catch(SecurityException | FileNotFoundException | FormatterClosedException ex){
             ex.printStackTrace();
        }

    }
}

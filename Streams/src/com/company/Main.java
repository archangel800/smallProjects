package com.company;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	//java views each file as a sequantial stream of bytes.
        //Byte-based streams - output and input data in its binary format- a char is 2 bytes, int is 4 bytes, double is 8 bytes
        //Character-based streams - every character is 2 bytes. in order to write 50000 we need 10 bytes, but for writing 7 we need 2 bytes.
        //Character based input and ouput can be performed with classes Scanner and forMatter.

        //absolute path - contains all directories, starting with the root directory, that lead to a specific file or directory.
        //relative path - is relative to another directory - for example, a path relative to the directory in which the application began executing.
        //URI - uniform resource identifier. - locating files vary across operating system.
        //URL - uniform resource locators - this is used to locate websites.

        //Path - Object of classes that implement Path represent the location of a file or directory. Path do not open files or provide any file processing
        //Paths - provides static methods used to get  path object representing a file or directory location
        //Files - Provides static methods for common file and directory manipulations, such as copying files; creating and deleting files and directories
        //DirectoryStream interface - Objects of classes that implement this interface enables a program to iterate through contents of a directory;


        Scanner input  = new Scanner(System.in);

        //create path object based on user input
        //we give directory name and passes it to paths static method get, whichi converts the String to a Path.
        Path path = Paths.get(input.nextLine());
        if (Files.exists(path)) {
            System.out.printf("%n%s exists%n", path.getFileName());
            System.out.printf("%s a directory %n", Files.isDirectory(path) ? "Is": "Is Not");
            System.out.printf("%s an absolute path%n", path.isAbsolute()? "Is":"Is Not");
            System.out.printf("Last modified: %s%n", Files.getLastModifiedTime(path));
            System.out.printf("Size: %s%n", Files.size(path));
            System.out.printf("Absolute path: %s%n", path.toAbsolutePath());
            if(Files.isDirectory(path)){
                System.out.printf("%n Directory contents:%n");

                DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);
                for(Path p: directoryStream)
                    System.out.println(p);
            }
        }
        else{
            System.out.printf("%s does not exist%n", path);
        }

    }
}

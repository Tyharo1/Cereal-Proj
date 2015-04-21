package javaemailproject;
import java.util.Scanner;
import java.io.*;
import java.io.PrintWriter;

/**
 * Travis Awrey
 * Java 316
 * 2/10/2015
 */
public class JavaEmailProject {
    
    public static void main(String[] args) throws IOException{
       
        //import file containing list of email subject lines
        java.io.File subjectlines = new java.io.File("subjects.txt");
        
        //create a scanner for the email subject lines
        Scanner input = new Scanner(subjectlines);
        
        //Create printwriter  constructers for each output file
        PrintWriter spam = new PrintWriter("spam.txt");
        PrintWriter goodfiles = new PrintWriter("goodfiles.txt");
        
        
        //read each line from the subject file
        while (input.hasNextLine()){
           //create string variable that holds the contents of the line
           String line = input.nextLine();
           
           //if the tested line contains confidential, output to spam
           if(line.contains("confidential")){
               spam.write(line);
               spam.println();
           } 
           
           //if the tested line contains Confidential, output to spam
           else if(line.contains("Confidential")){
               spam.write(line);
               spam.println();
           }
           //if the tested line contains Important, output to spam
           else if(line.contains("Important")){
               spam.write(line);
               spam.println();
           }
           //if the tested line contains important, output to spam
           else if(line.contains("important")){
               spam.write(line);
               spam.println();
           }
           
           //if the tested line does not contain a keyword, output to goodfiles
           else{
            goodfiles.write(line);
            goodfiles.println();
           }
        }
        
        //close each file
        input.close();
        spam.close();
        goodfiles.close();
        
    }
    
}

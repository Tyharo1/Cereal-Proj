package readdata;
import java.io.*;
import java.util.Scanner;

/**
 * @author Travis Awrey
 */

public class ReadData {

    
    public static void main(String[] args) throws IOException{
       //create the file instance
        java.io.File myfile = new java.io.File("JavaFile.txt");
        //create a scanner for the file
        Scanner input = new Scanner(myfile);
        //read from the file
        while (input.hasNext()){
           String firstname = input.next();
           String lastname = input.next();
           int grade = input.nextInt();
           System.out.println(firstname + " " + lastname + " " + grade);
        }
        //close file
        input.close();
        
    }
    
}

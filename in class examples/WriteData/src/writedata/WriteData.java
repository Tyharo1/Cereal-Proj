package writedata;
import java.io.*;
/**
 * @author Travis Awrey
 */
public class WriteData {

    
    public static void main(String[] args) throws IOException {
        //delcare a file 
        java.io.File myfile = new java.io.File("grades.txt");
        if (myfile.exists()){
            System.out.println("File already exists");
            System.exit(1); //close program
        }
        
        //create the file
        java.io.PrintWriter output = new java.io.PrintWriter(myfile);
        //write to the file that was just created
        output.print("John Smith"); //first record
        output.print(" ");
        output.println(90);
        output.print("Travis Awrey"); //second record
        output.print(" ");
        output.println(100);
        output.print("Jack Sparrow"); //third record
        output.print(" ");
        output.println(80);
        
        //close file
        output.close();
    }
    
    
}

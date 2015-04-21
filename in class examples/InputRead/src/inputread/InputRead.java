/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inputread;
import java.io.*;
import java.util.Scanner;

/**
 * @author BUS118
 */

public class InputRead {

   
    public static void main(String[] args) throws IOException{
        java.io.File JavaFile = new java.io.File("JavaFile.txt");
        //create a scanner for the file
        Scanner input = new Scanner(JavaFile);
        
        int count = 0;
       
        while (input.hasNext()) {
            if ("Java".equals(input.next())){
                    count++;
            }
        }
        System.out.println(count);
        //close file
        input.close();
        
    }
    
}





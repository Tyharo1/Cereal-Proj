package division;
import java.util.Scanner;

public class Division {
    
    
    //main method that calculates the quotient of two numbers
    public static int CalculateQuotient(int int1, int int2, int int3){
        //int results =0;
        if(int2 == 0)
            throw new ArithmeticException("divisor cannot be zero");
        if(int3 == 0)
            throw new ArithmeticException("divisor cannot be zero");
        int results =(int1/int2/int3);
        return results;
}    
    
    //main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
        //Prompt user to enter three numbers
        System.out.print("Enter three integers : ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        
        try {
        //create variable results that calls the quotient method
        int results = CalculateQuotient (number1, number2, number3);   
        //print out the quotient
        System.out.println(number1 + " / " + number2 + " / " + number3 + " is " + results);
        }
        
        catch (ArithmeticException ex ){
            System.out.println("Exception: an integer cannot be divided by zero.");
        }
    }
}

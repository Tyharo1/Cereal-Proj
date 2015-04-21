package javatextreader;
import java.util.Arrays;
public class JavaTextReader {
 
  
    String[] textArray = {"confidential I love this weather.",
                             "This message is confidential",
                             "You can't believe this.",
                             "This is just wrong.",
                             "Confidential Message"};
    
    
    
    private JavaTextReader()
  {
    
     if (Arrays.asList(textArray).contains("confidential"))   
     System.out.println();
  }
    

    
    public static void main(String[] args) {
       JavaTextReader();
       }
}






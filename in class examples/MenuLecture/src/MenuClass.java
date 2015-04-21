import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class MenuClass extends JFrame{
    //declare a few variables
        JMenuBar menubar;
        JMenu file;
        JMenuItem exit;
    
    //create a constructor for the class
        public MenuClass (){
            setLayout (new FlowLayout());
            //instantiate a menubar
            menubar = new JMenuBar();
            //add menubar to the frame
            setJMenuBar(menubar);
            //create an instance of a menu
            file = new JMenu("File");
            //add menu to the menu bar
            menubar.add(file);
            // create a new menu iteam
            exit = new JMenuItem("Exit");
            //add the menu item to the menu
            file.add(exit);
            
            //create an event 
            event e = new event();
            //monitor the action on exit
            exit.addActionListener(e);
        }
        
        //define event action listener
         public class event implements ActionListener {
                public void actionPerformed(ActionEvent e){
                    System.exit(0);
            }        
        
        }
        
        public static void main (String args[]) {
            MenuClass gui = new MenuClass();
            gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            gui.setSize(300, 200);
            gui.setVisible(true);
        }
}

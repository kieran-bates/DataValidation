/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datavalidation;

/**
 *
 * @author kibat6204
 */
import java.util.Scanner;
public class DataValidation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        boolean repeat = true;
        String userInput;
        System.out.print("Enter a string that is greater than 6 characters long -->");
        
        while(repeat == true)
        {
            try
            {
                userInput = input.next();
                if(userInput.length()>6)
                {
                    repeat = false;
                }
                else
                {
                    System.out.print("The string you entered is not greater than 6.  Try again -->");
                    repeat = true;
                }
            }
            catch(Exception e)
                    {
                        System.out.print("This is a general error.  Try Again -->");
                        repeat = true;
                    }
        }
    }
    
}

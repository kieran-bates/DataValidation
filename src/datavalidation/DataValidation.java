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
        
        repeat = true;
        System.out.print("Enter a string that contains the letter a -->");
        while(repeat == true)
        {
            try
            {
                String test;
                boolean exit = false;
                userInput = input.next();
                int runs = userInput.length();
                int character = 0;
                while(exit == false)
                {
                    test = Character.toString(userInput.charAt(character));
                    if(test.equals("a"))
                    {
                        System.out.println("The string you entered contains the letter a");
                        exit = true;
                        repeat = false;
                    }
                    else
                    {
                        if(character == runs-1)
                        {
                            System.out.print("The string you entered does not contain the letter a.  Try again -->");
                            exit = true;
                            repeat = true;
                        }
                        else
                        {
                        character = character+1;
                        exit = false;
                        }
                    }
                }
            }
            catch(Exception e)
                    {
                        System.out.print("This is a general error.  Try again -->");
                        repeat = true;
                    }
        }
        
        repeat = true;
        System.out.print("Enter an integer between 5 and 500 characters -->");
        while(repeat == true)
        {
            try
            {
                userInput = input.next();
                if(5<userInput.length() && userInput.length()<500)
                {
                    
                }
            }
            catch(Exception e)
                    {
                        
                    }
        }
    }
    
}

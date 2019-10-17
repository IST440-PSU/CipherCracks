/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg440project;

/**
 *
 * @author Dylan
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner auth = new Scanner(System.in);
        String user_ID = "admin";
        String password = "password";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String codedMessage;
        Boolean flag = false;
        
        /*
        
        while (flag == false) 
        {
            System.out.println("Please enter User ID");
            String tempID = auth.nextLine();
            
            if (tempID.equals(user_ID)) 
            {
                flag = true;
            }
            
            else 
            {
                System.out.println("This ID is incorrect");
            }
        }
        
        flag = false;
        
        while (flag == false) 
        {
            System.out.println("Please enter the password");
            String tempPass = auth.nextLine();
            
            if (tempPass.equals(password)) 
            {
                flag = true;
            }
            
            else 
            {
                System.out.println("This password is incorrect");
            }
        }
*/
        
        System.out.println("Welcome Decrypt Keeper! Please input the coded message.");
        codedMessage = auth.nextLine();
        System.out.println(codedMessage);

        for (int i = 0; i < 26; i++) 

        {
            String decryptedMessage = "";
            int key = i;
            for (int j = 0; j < codedMessage.length(); j++) 
            {
                int tempChar = alphabet.indexOf(codedMessage.charAt(j));
                if (tempChar - key < 0)
                {
                    tempChar = 26 + tempChar - key;
                }else {
                    tempChar = tempChar - key;
                }
                char decryptedChar = alphabet.charAt((tempChar) % 26);
                 if(codedMessage.charAt(j) ==' ') 
                {
                 decryptedChar = ' ';
                }

                decryptedMessage = decryptedMessage + decryptedChar;
            }
            System.out.println(decryptedMessage);
        }

    }
        
    
    
}

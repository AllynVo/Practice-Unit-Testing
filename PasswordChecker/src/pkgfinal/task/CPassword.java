/*
 * Allyn Vo
 * CS 302
 * Date:
 * Assignment:
 */
package pkgfinal.task;

/**
 *
 * @author allynvo
 */
/**
 *
 * @author Carlos Valdez
 */
import java.util.*;

public class CPassword {
    //checks if password length of 6
    boolean character(String password){
       boolean pass = false;
       int length = password.length();
       
       if(length>=6){
          pass = true; 
       }else{
           System.out.println("password length has the be at least 6");
       }
       
        return pass;
    }
    //check if there is at least one lower case letter
    boolean lower(String password){
        boolean pass= false;
        if(!password.equals(password.toUpperCase())){
            pass = true;
        }else{
            System.out.println("password must contain a lower case");
        }
        return pass;
    }
    //checks if there is at least one upper case letter
    boolean upper(String password){
        boolean pass = false;
        if(!password.equals(password.toLowerCase())){
            pass = true;
        }else{
            System.out.println("password must contain a upper case");
        }
        return pass;
    }
    //checks if there is at least one digit 
    boolean digit(String password){
        boolean pass = false;
        for(int i =0;i<password.length();i++){
            if(Character.isDigit(password.charAt(i))){
                pass = true;
                break;
            }
        }
        if(!pass){
            System.out.println("password must contain a digit");
        }
        return pass;
    }
    //checks if there is at least one special character
    boolean special(String password){
        boolean pass = false;
        
        if(password.matches(".*[!@#$%~^&*()_+].*")){
            pass = true;
        }else{
            System.out.println("password must contain a special character: ~!@#$%^&*()_+");
        }
        return pass;
    }
}

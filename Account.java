
package com.mycompany.account;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Account {
public static String firstName;
public static String lastName;
public static String Username;
public static String passWord;
public static String phoneNumber;
public static String checkUsername;
public static String checkPassword;
public class Login {
 public static boolean checkUserName(String Username){
       
  boolean abd = Username.contains("_");

  return Username.length()<= 5 && abd ; 
   
   } 
 public static boolean checkPasswordComplexity(String passWord){

     return  passWord.length() >= 8 &&
               passWord.matches(".*[A-Z].*") &&
               passWord.matches(".*[0-9].*") &&
               passWord.matches(".*[!@#$%^&*()_+=<>?/{}~`|\\\\].*");
 

 
 
   }   
public static boolean checkCellPhoneNumber(String phoneNumber){

return phoneNumber.matches("^(\\+27|27|0)(6|7|8)[0-9]{8}$");
}


public static String registerUser(){
                System.out.print("Please enter your Firstname: ");
                firstName = scanner.nextLine();
                System.out.print("Please enter your lastname: ");
                lastName = scanner.nextLine();
                System.out.print("Please enter your username: ");
                Username = scanner.nextLine();
                if(Login.checkUserName(Username)){
                    System.out.println("Username succesfully captured." );
                
                
                
                }else{
                    while(!Login.checkUserName(Username)){
                    System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length.");
                        System.out.print("Please enter username again: ");
                    Username = scanner.nextLine();
                    }
                     System.out.println("Username succesfully captured" );
                }
                    System.out.print("Please enter password: ");
                    passWord= scanner.nextLine();
                    
                    if(Login.checkPasswordComplexity(passWord)){
                        System.out.println("Password succesfully captured");
                    
                    }
                    
                    
                    
                    
                    
                    else{
                       
         while(!Login.checkPasswordComplexity(passWord)){
        System.out.println("Password is not correctly formatted;\n"+"please ensure that the password contains at least eight characters, a capital letter ,  a number and a special character: ");
        passWord = scanner.nextLine();
        }
                        System.out.println("Password succesfully captured");
                    }
                    
                    
                    
                    
                    
                    
                    System.out.print("Please enter cell phone number: ");
                    phoneNumber = scanner.nextLine();
                    if(Login.checkCellPhoneNumber( phoneNumber)){
                    
                        System.out.println("Cell phone number succesfully added");
                        System.out.println("You have been registered");
                    
                    }
                    
                    
                    
                    
                    
                    else{
                    
                     while(!Login.checkCellPhoneNumber( phoneNumber)){
                    System.out.println("Cell phone number incorrectly formatted or does not contain international code");
                        System.out.print("Please enter cell phone number again: ");
                    phoneNumber = scanner.nextLine();
                    
                    }

                    }

return "You have been registered";

}

public static boolean loginUser(String Username,String passWord){

return checkUsername.matches(Username)&& checkPassword.matches(passWord);





}
public static String returnLoginStatus(){

  if(Login.loginUser(Username,passWord)){
            return "Welcome "+firstName +" "+ lastName +" it is great to see you";
         
        }else{
        
            
          return  "Password or Username is incorrect "+"Login failed" ;
        }
        


}



}

public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("====Registration====");
        Login.registerUser();
        System.out.println("====Login====");
        System.out.print("Please enter your username: ");
        checkUsername = scanner.nextLine();
        System.out.print("Please enter your password: ");
        checkPassword = scanner.nextLine();
        System.out.println(Login.returnLoginStatus());
      
        
        
    }
    
    
}

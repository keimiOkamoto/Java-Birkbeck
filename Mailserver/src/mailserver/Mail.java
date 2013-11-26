/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mailserver;

import java.util.Scanner; 

public class Mail {
    private Scanner x = new Scanner(System.in);
    
    private String input;
    private String command;
    boolean first=true;
    boolean second  = false;
    boolean third = false;
    boolean b1 = true;
    String myEmail;
    String theirEmail;
    String messageBody ="";
    
    
    public void mailCommand (String command) {
        
        
        
        if (command.equals("MAIL FROM") && first == true) {
          
            input = x.nextLine();
            this.validCheck(input);
   
        } 
        else if (command.equals("RCPT FROM") && second == true)  {
            
            input = x.nextLine();
            this.validCheck(input);
        
        } 
        else if (command.equals("DATA") && third == true) {
            
            this.message();
        }
        else if (command.equals("QUIT")) {
            
            System.out.println("Goodbye!");
        }
        else{
            System.out.println("Invalid command");
            input = x.nextLine();
            this.mailCommand(input);
             
        }
    }
        
    
    public void validCheck (String input) {
       boolean go = true;
       int atPos = 0;
       
       
       for (int i = 0; i <= input.length(); i++) {
            
            char email = input.charAt(i);
            if (email == '@'){
                atPos = i; 
                break;
            }
        }

       
        if (atPos==0){
            System.out.println("Ivalid email address.");
            input = x.nextLine();
            this.validCheck(input);

        } else if (atPos == input.length()-1) {
            System.out.println("Ivalid email address. END");
            input = x.nextLine();
            this.validCheck(input);
        } else {
            if(b1){
               
                System.out.println("OK");
                myEmail = input;
                first=false;
                second=true;
                b1 = false;
                command = x.nextLine();
                this.mailCommand(command);
                
            }else{
              
                System.out.println("OK");
                theirEmail = input;
                command = x.nextLine();
                first=false;
                second=false;
                third = true;
                this.mailCommand(command);
                
            }
        }
       
        }
    
    public void message () {
        boolean stop =true;
        
        while (stop) {
            
            input = x.nextLine();
        
        if (input.isEmpty()) {
            input = x.nextLine();

            if (input.equals(".")) {
                System.out.println("Ending program...");
                stop=false;
                this.result();
            } else {
                input = x.nextLine();
                messageBody += input + " \n";
            }
        } else {
            messageBody += input + " \n";

        }
      }  
 
    }
      public void result () {
          System.out.println("from: " + myEmail);
          System.out.println("to: " + theirEmail);
          System.out.println("message: \n" + messageBody);
          this.quit();
      }   
      
      public void quit(){
            System.out.println("Goodbye!");
      }

}

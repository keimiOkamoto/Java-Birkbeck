/*
-Welcome prompt
user enters must enter the valid command "MAIL FROM:
is it valid?
----if there is an error program must say its an invalid emain and user must enter another one

comp ays OK
user entera RCPT FROM: 
user enters friends address
is it valid?
----if there is an error program must say its an invalid emain and user must enter another one

once both commands have gone through and are valid user can enter DATA
progran reads paragaph until it reads a line with only a dot .
At this point thee program must send the email.
from:
to:
message: 

if at any point QUIT is typed the program teminates. 

 */

package mailserver;

import java.util.Scanner;

public class Mailserver {

    public static void main(String[] args) {
        
        System.out.println("Welcome to my mail server! ");
        Scanner x = new Scanner (System.in);
        String input = x.nextLine();
        
        Mail aMail = new Mail ();
        aMail.mailCommand(input);
               
        
        
        
        
    }
    
}

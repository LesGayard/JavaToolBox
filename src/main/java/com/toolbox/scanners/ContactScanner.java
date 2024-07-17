package com.toolbox.scanners;

import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

@Data
public class ContactScanner {

    private Scanner scanner = new Scanner(System.in);

    Logger logger = LoggerFactory.getLogger(ContactScanner.class);

  /* public void createContact(){
       logger.info("New Contact Scanner Creation");
        Contact contact = new Contact();
       System.out.println("Hello Please Enter Firstname");
       String firstname = scanner.nextLine();
       System.out.println("Name");
       String name = scanner.nextLine();
       System.out.println("email");
       String email = scanner.nextLine();
       System.out.println("Your enter Firstname : " + firstname + "Your enter Name : " + name +"Your enter Email: " + email +" Thanks !!" );
       logger.info("Contact Init : " + contact.toString());
       contact.setFirstname(firstname);
       contact.setName(name);
       contact.setEmail(email);
       logger.info("Contact Infos Scanner : " + contact.toString());



   }*/
}

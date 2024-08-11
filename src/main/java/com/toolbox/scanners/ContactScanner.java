package com.toolbox.scanners;

import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service
public class ContactScanner {

  /*  Logger logger = LoggerFactory.getLogger(ContactScanner.class);
    ContactServices services = ContactServices.builder().build();
    private Scanner scanner = new Scanner(System.in);

   public void createContact(){
       logger.info("New Contact Scanner Creation");
       System.out.println("Hello Please Enter Firstname");
       String firstname = scanner.nextLine();
       System.out.println("Name");
       String name = scanner.nextLine();
       System.out.println("email");
       String email = scanner.nextLine();
       System.out.println("Your enter Firstname : " + firstname + "Your enter Name : " + name +"Your enter Email: " + email +" Thanks !!" );
       ContactDto dto = new ContactDto(0,firstname,name,email,null);
       logger.info("Contact Infos Scanner : " + dto.toString());
       services.addUpdate(dto);

   }

   public void searchNameOrEmail(){
       logger.info("Search Contact Scanner");
       System.out.println("Search for Contact  with name : ");
       String name = scanner.nextLine();
       System.out.println("Search for Contact firstname : ");
       String firstname = scanner.nextLine();
       System.out.println("Search for Contact email : ");
       String email = scanner.nextLine();
       Contact byName = services.searchName(name,firstname);
       System.out.println("We found contact by name: " + byName);
       Contact byEmail = services.searchEmail(email);
       System.out.println("We found contatc by email : ");




   }*/
}

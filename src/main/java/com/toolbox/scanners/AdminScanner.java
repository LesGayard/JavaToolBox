package com.toolbox.scanners;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.Scanner;
@Service
@Getter
@Setter
public class AdminScanner {

    private Scanner scanner = new Scanner(System.in);
    /* TO DO : SINGLETON BETTER */
    private ContactScanner contactScanner = new ContactScanner();


    public void  run(){System.out.println("****************************************************************************");
        System.out.println("****************************************************************************");
        System.out.println("****************************************************************************");
        System.out.println("Using Scanner before Front End Framework");
        System.out.println("****************************************************************************");
        System.out.println("****************************************************************************");
        System.out.println("****************************************************************************");
        System.out.println("****************************************************************************");
        System.out.println("***********CHOOSE MENU ******");
        System.out.println("***MENU 1 - CALENDAR BY API ****************************************");
        System.out.println("****************************************************************************");
        System.out.println("***MENU 2 - MEETINGS ****************************************");
        System.out.println("****************************************************************************");
        System.out.println("***MENU 3 - NOTES ****************************************");
        System.out.println("*************CHOOSE TYPE NOTE ***************************************");
        System.out.println("***MENU 4 - NOTES ****************************************");
        System.out.println("*************AUDIO TYPE NOTE ***************************************");
        System.out.println("***MENU 5 - NOTES ****************************************");
        System.out.println("*************BASIC TYPE NOTE ***************************************");
        System.out.println("***MENU 6 - AUTOMOTIVE ****************************************");
        System.out.println("****************************************************************************");
        System.out.println("***MENU 7 - FILES ****************************************");
        System.out.println("***MENU  8  - CONTACTS******************************************************");

        int input = scanner.nextInt();
        switch (input){
            case 1:
                System.out.println("***MENU 1 - CALENDAR BY API ****************************************");
                System.out.println("****************************************************************************");
                break;
            case 2 :
                System.out.println("***MENU 2 - MEETINGS ****************************************");
                System.out.println("****************************************************************************");
                break;
            case 3 :
                System.out.println("***MENU 3 - NOTES ****************************************");
                System.out.println("*************CHOOSE TYPE NOTE ***************************************");
                /*  TO DO :  FIX CHOICE AUDIO AND BASIC NOTE */
                break;
            case 4:
                System.out.println("***MENU 4 - AUTOMOTIVE ****************************************");
                System.out.println("****************************************************************************");
                break;
            case 5:
                System.out.println("***MENU 5 - FILES ****************************************");
                System.out.println("****************************************************************************");
                break;
            case 8:
                System.out.println("***MENU 8 - CONTACTS******************************************************");
                System.out.println("****************************************************************************");

                System.out.println("***MENU 1 - SEARCH CONTACT  ******************************************************");
                System.out.println("****************************************************************************");
                System.out.println("***MENU 2 - CREATE - UPDATE CONTACT  ******************************************************");
                System.out.println("****************************************************************************");
                System.out.println("***MENU 3 - DELETE CONTACT  ******************************************************");
                Scanner scannerContact = new Scanner(System.in);
                int contactInput = scanner.nextInt();
                switch (contactInput){
                    case 1:
                        System.out.println("****************************************************************************");
                        System.out.println("***MENU 1 - SEARCH CONTACT  ******************************************************");
                        contactScanner.searchNameOrEmail();
                        break;
                    case 2:
                        System.out.println("***MENU 2 - CREATE - UPDATE CONTACT  ******************************************************");
                        System.out.println("****************************************************************************");
                        contactScanner.createContact();
                        break;
                    case 3:
                        System.out.println("***MENU 3 - DELETE CONTACT  ******************************************************");
                        System.out.println("****************************************************************************");
                        break;
                    default: System.out.println("PLEASE TRY AGAIN");
                }
                break;
            default:System.out.println("PLEASE TRY AGAIN");

        }
    }


}

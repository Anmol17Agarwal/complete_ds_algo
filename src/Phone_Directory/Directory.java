package Phone_Directory;

import java.util.Scanner;
/*
* This will be considered as Main class
*/
public class Directory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContactNode contactNode = new ContactNode();
        while (true) {
            System.out.println("Press 1 to add a contact in new Contact List");
            System.out.println("Press 2 to search a contact by name");
            System.out.println("Press 3 to search a contact by phone number");
            System.out.println("Press 4 to delete a contact from contact list");
            System.out.println("Press 5 to show complete Contact List");
            int option = scanner.nextInt();

            switch (option) {
                case 1: {
                    System.out.println("Enter phone number");
                    long phoneNumber = scanner.nextLong();
                    System.out.println("By what name you want to save");
                    String name = scanner.next();
                    contactNode.addNode(name, phoneNumber);
                    contactNode.sorting();
                    contactNode.removeDuplicates();
                }
                break;

                case 2: {
                    System.out.println("Enter contact name");
                    String name = scanner.next();
                    contactNode.searchByName(name);
                }
                break;

                case 3: {
                    System.out.println("Enter contact phone number");
                    long phoneNumber = scanner.nextLong();
                    contactNode.searchByPhoneNumber(phoneNumber);
                }
                break;

                case 4:
                {
                    System.out.println("Enter contact name to be deleted");
                    String name = scanner.next();
                    contactNode.deleteContact(name);
                }
                break;
                case 5: {
                    contactNode.display();
                    System.out.println();
                }
                break;
                default:
                    System.out.println("Oops! you pressed wrong input");
                    break;
            }
        }
    }
}

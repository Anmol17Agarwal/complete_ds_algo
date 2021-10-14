package Phone_Directory;
/*
* Main class basically is created to get a rough idea about behind the scene.
*
* */
public class RoughWork {
    public static void main(String[] args) {
        ContactNode contactNode = new ContactNode();


        PhoneList firstContact = new PhoneList("Anmol", 9794696252L);
        PhoneList secondContact = new PhoneList("Babloo",9236955702L);
        PhoneList thirdContact = new PhoneList("Chetan",99182748842L);
        PhoneList fourthContact = new PhoneList("Dabloo",8793256845L);
        contactNode.head=firstContact;
        firstContact.next=secondContact;
        secondContact.next=thirdContact;
        thirdContact.next=fourthContact;
        contactNode.searchByPhoneNumber(9794696252L);
        contactNode.display();
        System.out.println();

        contactNode.deleteContact("Chetan");
        contactNode.display();
        System.out.println();

        /*
        contactNode.display();
        System.out.println();



        contactNode.addNode("Anmol",9794696257L);
        contactNode.addNode("Babloo",9236955702L);
        contactNode.addNode("Abhay",4569871256L);
        contactNode.addNode("Dabloo",8792356845L);
        contactNode.addNode("Chetan",99182748842L);
        contactNode.display();
        System.out.println();


        System.out.println(contactNode.head.name);
        contactNode.swapping(firstContact,secondContact);
        contactNode.display();
        System.out.println();

        contactNode.sorting();
        contactNode.display();
        System.out.println();


        contactNode.searchByName("Babloo");

        contactNode.searchByPhoneNumber(9236955702L);

        contactNode.removeDuplicates();
        contactNode.display();
        System.out.println();
*/
    }
}

package Phone_Directory;


public class PhoneList extends ContactNode {

    String name;
    long phoneNumber;
    PhoneList next;


    public PhoneList(String name,long phoneNumber)
    {
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.next=null;

    }
    public void details()
    {
        System.out.println(name+" : "+phoneNumber);
    }


}

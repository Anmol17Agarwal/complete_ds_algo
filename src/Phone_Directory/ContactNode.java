package Phone_Directory;

public class ContactNode {
    PhoneList head;


    public void display() {
        PhoneList current = head;
        while (current != null) {
            System.out.print(current.name + " : " + current.phoneNumber + " -->");
            current = current.next;
        }
        System.out.print("null");
    }

    public void addNode(String name, long phoneNumber) {
        PhoneList newNode = new PhoneList(name, phoneNumber);
        if (head == null) {
            head = newNode;
        } else {
            PhoneList current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }



    public void swapping(PhoneList contact1, PhoneList contact2) {
        String nameValue = contact1.name;
        long numberValue = contact1.phoneNumber;
        contact1.name = contact2.name;
        contact1.phoneNumber = contact2.phoneNumber;
        contact2.name = nameValue;
        contact2.phoneNumber = numberValue;
    }

    public void sorting() {
        PhoneList current1 = head;
        if(head==null)
        {
            System.out.println("List is empty");
        }

        while (current1 != null) {
            PhoneList current2 = current1.next;
            while (current2 != null)
            {
                if ((current1.name.compareTo(current2.name)) > 0) {
                    swapping(current1, current2);
                }
                current2 = current2.next;
            }
            current1 = current1.next;
        }

    }

    public void searchByName(String name)
    {
        PhoneList current = head;
        if(head==null)
        {
            System.out.println("List is empty");
        }
        while (current!=null)
        {
            if(current.next!=null)
            {
                if (current.name.compareTo(name) == 0)
                {
                    current.details();
                }
            }
            else
                {
                    System.out.println("Sorry!! This contact is not save");
                }
            current=current.next;
        }
    }


    public void searchByPhoneNumber(long phonenumber)
    {
        PhoneList current = head;
        if(head==null)
        {
            System.out.println("List is empty");
        }
        while (current.next!=null)
        {
            if(current!=null)
            {
                if (current.phoneNumber==phonenumber)
                {
                   current.details();
                }
            }
            else
            {
                System.out.println("Sorry!! This contact is not save");
            }
            current=current.next;
        }
    }

    public boolean duplicates(PhoneList contact1,PhoneList contact2)
    {
        if(contact1.name.equals(contact2.name) && (contact1.phoneNumber==contact2.phoneNumber))
        {
            return true;
        }
        else {
            return false;
        }
    }

    public void removeDuplicates()
    {
        PhoneList current1=head;
        while (current1!=null)
        {
            PhoneList current2 = current1.next;
            while (current2 != null)
            {
                if (duplicates(current1, current2))
                {
                    current1.next = current2.next;
                    current2 = current2.next;
                }
                else
                {
                    current2 = current2.next;
                }
            }
            current1=current1.next;
        }
    }
    public void deleteContact(String name) {
        if (head.name.compareTo(name) == 0) {
            head = head.next;
        }
        else {
            PhoneList current = head;
            PhoneList temp=null;
            PhoneList nextOfCurrent = current.next;
            while (nextOfCurrent != null) {
                if ((nextOfCurrent.name.compareTo(name)) == 0) {
                    current.next = nextOfCurrent.next;
                    nextOfCurrent.next=null;
                    nextOfCurrent = current.next;
                }
                nextOfCurrent = nextOfCurrent.next;
                current = current.next;
            }
        }
    }
}


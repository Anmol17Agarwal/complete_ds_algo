package SingleLinkedList;

public class Main {

        public static void main(String[] args)
        {
            SLL sll = new SLL(); // create object
            SLL.ListNode first = new SLL.ListNode(10); // default value of first element
            SLL.ListNode second = new SLL.ListNode(20);
            SLL.ListNode third = new SLL.ListNode(20);
            SLL.ListNode fourth = new SLL.ListNode(20);// default value of second element
            SLL.ListNode fifth= new SLL.ListNode(30); // default value of third element
            SLL.ListNode sixth = new SLL.ListNode(40);
            SLL.ListNode seventh = new SLL.ListNode(40);
            SLL.ListNode eigth= new SLL.ListNode(40);// default value of fourth element

            sll.head = first; //storing first value as head
            first.next = second; //linking node using next
            second.next = third; //linking node using next
            third.next = fourth;//linking node using next
            fourth.next = fifth;
            fifth.next = sixth;
            sixth.next=seventh;
            seventh.next=eigth;

            sll.display();
            System.out.println();

            SLL sll1 = new SLL(); // create object
            SLL.ListNode first1 = new SLL.ListNode(15); // default value of first element
            SLL.ListNode second1 = new SLL.ListNode(25); // default value of second element
            SLL.ListNode third1 = new SLL.ListNode(35); // default value of third element
            SLL.ListNode fourth1 = new SLL.ListNode(45); // default value of fourth element

            sll1.head = first1; //storing first value as head
            first1.next = second1; //linking node using next
            second1.next = third1; //linking node using next
            third1.next = fourth1; //linking node using next


            sll1.display();
            System.out.println();
            MergeTwoList.mergeTwoList(sll.head,sll1.head);
            sll.display();
            System.out.println();
            sll1.display();
            System.out.println();
            DeleteDuplicates.deleteDuplicate(sll.head,sll.head.next);
            sll.display();
      /*
        sll.addFirst(5);
        System.out.println();
        sll.display();
        System.out.println();
        sll.addLast(70);
        sll.display();
        System.out.println();
        sll.addLast(50);
        sll.display();
        System.out.println();
        sll.deleteFirst();
        sll.display();
        System.out.println();
        sll.deleteLast();
        sll.display();
        System.out.println();
        sll.insertNode(1,5);
        sll.display();
        System.out.println();
        sll.insertNode(2,15);
        sll.display();
        System.out.println();
        sll.display();
        System.out.println();
        sll.insertNode(7,70);
        sll.display();
        sll.deleteNode(5);

        System.out.println();
        sll.display();
        if(sll.find(30))
        {
            System.out.println("Search key found");
        }
        else {
            System.out.println("Search key is not found");
        }
        sll.head=sll.reverseList(sll.head);
        System.out.println("Reversed List = ");
        sll.display();

        SLL.ListNode nthNode=sll.nthNodeFromLast(2);
        System.out.println(nthNode.data);
        SLL.ListNode middleNode = sll.middleNode();
        System.out.println("Middle Node"+ middleNode.data);
    System.out.println("Length of LinkedList = "+sll.length());
  */
        }
    }



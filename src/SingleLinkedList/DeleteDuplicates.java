package SingleLinkedList;



public class DeleteDuplicates extends SLL {

    public static ListNode deleteDuplicate(ListNode head,ListNode current)
    {
        if(head.next==null)
        {
            return head;
        }
        if(head.data==current.data)
        {
            head.next=current.next;
            current = current.next;
            deleteDuplicate(head,current);
        }
        else {
            current=current.next;
            deleteDuplicate(head.next,current);
        }
        return head;
    }

}


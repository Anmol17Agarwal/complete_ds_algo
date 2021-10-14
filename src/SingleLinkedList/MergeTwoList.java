package SingleLinkedList;



public class MergeTwoList extends SLL{
    public static ListNode mergeTwoList(ListNode sll, ListNode sll1)
    {
        if(sll==null)
            return sll1;

        if(sll1==null)
            return sll;
        if(sll.data<sll1.data)
        {
            sll.next = mergeTwoList(sll.next,sll1);
            return sll;
        }
        else
        {
            sll1.next = mergeTwoList(sll,sll1.next);
            return  sll1;
        }
    }
}


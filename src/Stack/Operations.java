package Stack;

public class Operations {

    Stack head;

    public void isEmpty() {
        if (head == null)
            System.out.println("Is Empty");
        else
            System.out.println("Is not empty");
    }

    public int peek() {
        if (head == null)
            return -1;
        else
            return head.data;

    }

    public void push(int data) {

        Stack newItem = new Stack(data);
        if (head == null) {
            head = newItem;
        } else {
            Stack temp = head;
            head = newItem;
            head.next = temp;
        }
    }

    public int pop() {
        if (head == null) {

            return -1;
        } else {
            Stack temp = head;
            head = temp.next;
            return temp.data;

        }
    }
}

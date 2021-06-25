package additional_problems.linkedList;

/**
 * This class is the type declaration for a linked list
 * Created by aarushi on 24/6/21.
 */
public class ListNode {
    //data fields
    private int data; //stores the value of the node
    private ListNode next; //stores the reference of the next node

    //constructor to initialize the value of the node
    public ListNode(int data){
        this.data= data;
    }

    //accessor method to get the value stored in data
    public int getData() {
        return this.data;
    }

    //mutator method to change the value of data
    public void setData(int data) {
        this.data = data;
    }

    //accessor method which returns the reference of the next node
    public ListNode getNext() {
        return this.next;
    }

    //mutator method which changes the reference of the next node
    public void setNext(ListNode next) {
        this.next = next;
    }
}

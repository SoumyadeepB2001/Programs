class LinkedList
{
    Node head;
    int size;

    LinkedList()
    {
        size=0;
    }

    public class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next=null;
            size++;
        }
    }

    public void addFirst(int data)
    {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data)
    {
        Node newNode = new Node(data);

        //Check if any previous nodes exist in the linked list
        if(head == null)
        {
            head = newNode;
            return;
        }

        //If the linked list already has previous nodes in it

        Node lastNode = head;

        //Iterate through the list to reach the last node
        while(lastNode.next != null)
        {
            lastNode = lastNode.next;
        }

        lastNode.next = newNode;
    }

    public void printList()
    {
        Node currNode = head;

        while(currNode != null)
        {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(3);
        list.addLast(4);
        list.addFirst(2);
        list.addFirst(1);
        list.printList();
    }
}
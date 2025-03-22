class Node
{
    int data;
    Node next;
    Node(int x)
    {
        data = x;
        next = null;
    }
}
class LinkedList
{
    Node head;
    Node tail;
    LinkedList()
    {
        head = null;
        tail = null;
    }
    void insert(int x)
    {
        Node temp = new Node(x);
        if(head==null)
        {
            head = temp;
            tail = head;
        }else
        {
            tail.next = temp;
            tail = tail.next;
        }
    }
    int delete_from_end()
    {
        Node temp = head;
        if(head==null)
        {
            System.out.println("List is empty");
            return -1;
        }
        while(temp.next != tail)
        {
            temp = temp.next; 
        }
        int x = tail.data;
        Node d = tail;
        tail = temp;
        tail.next = null;
        return x;
        
    }
    void display()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }
}
class Question5
{
    public static void main(String arg[])
    {
        LinkedList l = new LinkedList();
        l.insert(3);
        l.insert(4);
        l.insert(5);
        l.insert(6);
        l.insert(7);
        System.out.println(l.delete_from_end());
        l.display();

    }
}
//output
// PS C:\Users\Dell\Desktop\JAVA\Assignments\Assignment-3> java Question5
// deleted element- 7
// list=>
// 3 4 5 6 
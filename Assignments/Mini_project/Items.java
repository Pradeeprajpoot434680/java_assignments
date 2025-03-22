class Node
{
    Item item;
    Node next;
    Node(Item p)
    {
        item =p;
        next = null;
    }
};

class Items 
{
    Node front,tail;
    Items()
    {
        front=tail=null;
    }
    // insert a item
    void insert_item(String item_name,int quantity,int price)
    {
        Item i1 = new Item(item_name,quantity,price);
        Node  temp = new Node(i1);
        if(front==null)
        {
            front = temp;
            tail = front;
        }else
        {
            tail.next = temp;
            tail = tail.next;
        }
    }
    // if quantity of an item has become 0 then remove this item from the list
    // it will check at every quantity change
    void update_quantity(String item_name,int quantity)
    {
        //iterate on the list
        Node temp = front;
        Node prev = null;
        while(temp != null)
        {
            // it quantity of any item is 0 then remove from the list
            if(temp.item.quantity==0)
            {
                if(temp==front)
                {
                    front = temp.next;
                }else
                {
                    prev.next =temp.next;
                }
            }
            if(temp.item.item_name == item_name)
            {
                if(quantity<0)
                {
                    System.out.println("Quantity can not be negetive");
                    return ;
                }
                temp.item.quantity=quantity;
            }
            prev = temp;
            temp= temp.next;
        }

    }

    void display_item()
    {
        Node temp = front;
        while(temp != null)
        {
            System.out.print(temp.item.item_name +" | " );
            System.out.print(temp.item.quantity + " | "  );
            System.out.print(temp.item.price );
            System.out.println();
            
            temp=temp.next;
        }
    }
}
class Products
{
    public static void main(String arg[])
    {
        Items p1 = new Items();
        p1.insert_item("Laptop",10,70000);
        p1.insert_item("Watch",5,700);
        p1.insert_item("Phone",20,27000);
        p1.insert_item("Bottle",40,20);
        p1.update_quantity("Laptop",5);
        p1.display_item();
    }
}
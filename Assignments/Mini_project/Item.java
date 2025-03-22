class Item
{
    String item_name;
    int quantity;
    int price;
    Item(String item_name,int quantity,int price)
    {
        this.item_name = item_name;
        this.quantity=quantity;
        this.price = price;
    }
    // void update_quantity(int x)
    // {
    //     if(x<0)
    //     {
    //         System.out.println("Quantity can not be negetive");
    //         return ;
    //     }
    //     quantity=x;

    // }
    // void update_price(int price)
    // {
    //     if(price<0)
    //     {
    //         System.out.println("Quantity can not be negetive");
    //         return ;
    //     }
    //     this.price = price;
    // }

}
//it should an interface
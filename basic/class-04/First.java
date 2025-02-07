class Rectangle
{
   private int l,w;
   Rectangle(int l,int w)
   {
    this.l = l;
    this.w = w;
   }
   void setLen(int x)
   {
    l =x;
   }
   void setWid(int y)
   {
    w = y;
   }
   protected void show()
   {
    System.out.println(l*w);
   }
}
// class B extends A
// {
//     B(int x)
//     {
//         super(3,4);
//     }
//     void show()
//     {
//         System.out.println("From class B");
//     }
// }
class First
{
    public static void main(String arg[])
    {
        Rectangle obj = new Rectangle(2,6);
        // obj.l =20;
        obj.show();
        // A obj2 = new A();
    }
}


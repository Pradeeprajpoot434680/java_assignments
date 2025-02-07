class A
{
   int x;
   int a,b;
   A(int x,int y)
   {
    a = x;
    b =y;
    System.out.println("parent constructor");
   }
   void showX()
   {
    System.out.println("parent:"+x);
   }
}
class B extends A
{
    int x;
    B()
    {
        super(4,5);
        System.out.println("child constructor");
        x =40;
        super.x =50;
    }
    void showX()
    {
        System.out.println("child" + x);
    }
}

class Test2
{
    public static void main(String arg[])
    {
       B obj1 = new B();
    //    obj1.showX();
    //    A o = obj1;
    //    o.showX();
       A ob = new A(34,45);
    //    ob.showX();
       ob = obj1;
       ob.showX();
    }
}

       
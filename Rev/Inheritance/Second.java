class Parent
{
    Parent(int a,int b)
    {
        System.out.println("Parent constructor");
    }
    void show()
    {
        System.out.println("from parent class");
    }
}
class Child extends Parent
{
   Child()
   {
    super(3,4);
   }
    void show()
    {
        super.show();

    }
}
class Second
{
    public static void main(String arg[])
    {
        Parent p = new Child();
        Parent q = new Parent(3,4);
        // p.show();
        Child c = new Child();
        c.show();
        System.out.println(q.getClass());
    }
}
    
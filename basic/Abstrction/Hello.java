abstract class A
{
    int a;
    final void show()
    {
        System.out.println("this is the show method");
    }
    abstract void method1();
    abstract void method2();
   
}
class B extends A
{
    void method1()
    {
        System.out.println("this is the class b M-1");
    }
    void method2()
    {
        System.out.println("this is the class b M-2");
    }
    // void show()
    // {
    //     System.out.println("hii");
    // }
}
class Hello
{
    public static void main(String arg[])
    {
        A obj = new B();
        obj.method1();
        obj.show();
    }
}
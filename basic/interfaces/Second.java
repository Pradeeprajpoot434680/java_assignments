interface In1
{
    void method1();
    void method2();
}

abstract class A implements In1
{
    public void method1()
    {
        System.out.println("Class A");
    }
}
class B extends A
{
    public void method2()
    {
        System.out.println("From class B");
    }
}
class Tata
{
    public static void main(String arg[])
    {
        In1 ob = new B();
        ob.method1();
        ob.method2();
    }
}
    

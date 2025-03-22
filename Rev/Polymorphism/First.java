// compile time method overloading
class Poly
{
    Poly()
    {
        System.out.println("poly constructure");
    }
    void sum(int a,int b)
    {
        System.out.println(a+b+"Poly");
    }
    
    void sum(int a,int b,int c)
    {
        System.out.println(a+c+b+"poly");
    }
}
class Parent extends Poly
{
      Parent()
    {
        System.out.println("Parent constructure");
    }
    void sum(int a,int b)
    {
        System.out.println(a+b+"parenet");
    }
   
}
class Hello
{
    public static void main(String arg[])
    {
        Poly p = new Parent();
        p.sum(3,4);
        p.sum(4,5,6);
    }
}
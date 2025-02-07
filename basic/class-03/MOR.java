class First
{
    static int s;
    static {
        
        s = 12;
        System.out.println("This is static blog" + s);
    }
    First()
    {
        s =10;
        System.out.println("This is constructor of first class"+s);
    }
    void show()
    {
        
        System.out.println("First class");
    }
};
// class Second extends First
// {
//      void show()
//     {
//         System.out.println("Second class");
//     }
// }
class MOR
{
    public static void main(String arg[])
    {
        First.s = 40;
        System.out.println(First.s);
        First s = new First();
        s.show();
    }
}
class Test
{
    public static void fn1()
    {
        int b=0,a=10;
        int c=a/b;
    }

    public static void fn2()
    {
        System.out.println("This is function 2");
        fn1();
    }
    public static void fn3()
    {
        System.out.println("This is function 3");
        fn2();
    }

    public static void main(String arg[])
    {
       try
       {
         fn3();
       }
       catch(Exception e)
       {
        System.out.println(e);
       }
    }
}
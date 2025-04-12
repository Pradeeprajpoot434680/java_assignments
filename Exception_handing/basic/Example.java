class Example
{
    public static void main(String arg[])
    {
        int a=10;
        int b=0;
        int c=0;
       try
       {
          c= a/b;
       }
       catch(Exception e)
       {
        System.out.println("b can not be zero");
        System.out.println(e);
       }
        System.out.println(c);
    }
}
//exception - java.lang.ArithmeticException
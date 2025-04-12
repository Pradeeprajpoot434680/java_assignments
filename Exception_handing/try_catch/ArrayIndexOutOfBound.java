class ArrayIndexOutOfBound
{
    public static void main(String arg[])
    {
        int c =0;
        try
        {
            int a = Integer.parseInt(arg[0]);
            int b = Integer.parseInt(arg[1]);
            c = a/b;
        }
        catch(ArithmeticException e)
        {
            c=0;
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        catch(NumberFormatException e)
        {
            System.out.println(e);
        }
        System.out.println(c);
    }
}
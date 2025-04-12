
class CommandLineArg
{
    public static void main(String arg[])
    {
        int c=0;
        try
        {
         c = Integer.parseInt(arg[0])/Integer.parseInt(arg[1]);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println(c);
    }
}
// here will be java.lang.ArrayIndexOutOfBoundsException if argument length is less than 2
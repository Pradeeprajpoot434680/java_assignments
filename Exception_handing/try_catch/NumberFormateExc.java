import java.util.Scanner;
class NumberFormateExc
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("enter the number:");
        try
        {
            num = Integer.parseInt(sc.nextLine());
        }
        catch(NumberFormatException e)
        {
            num =0;
            System.out.println(e);
        }
        System.out.println("value of num is:"+num);
    }

}
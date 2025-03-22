import java.util.Scanner;
import java.util.regex.Pattern;
class Question3
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String arg[])
    {
        boolean flag = false;
        System.out.print("Enter a string:");
        String s = sc.nextLine();
        if(s.length()==0)
        {
            System.out.println("String is empty");
            return;
        }
        flag = s.matches("[01]*");
        if(flag)
        {
            System.out.println("String is binary sequence");
            return;
        }
        System.out.println("String is not a binary sequence");

    }
    
}
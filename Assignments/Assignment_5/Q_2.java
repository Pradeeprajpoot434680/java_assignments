import java.util.Scanner;
class Question2
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String arg[])
    {
        System.out.print("Enter a string:");
        String s = sc.nextLine();
        String[] ans = s.split(" ");
        for(String str : ans)
        {
            System.out.println(str);
        }
    }
    
    
}
import java.util.Scanner;
class Question4
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String arg[])
    {
        int n ;
        System.out.print("Enter the total number of emails:");
        n = sc.nextInt();
        String emails[n];
        for(int i=0; i<n; i++)
        {
            int a = i+1;
            System.out.print("Enter the "+ a + "th email:");
            emails[i] = sc.nextLine();
        }
    }
}
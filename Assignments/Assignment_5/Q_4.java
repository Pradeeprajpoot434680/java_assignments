import java.util.Scanner;
class Question4
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String arg[])
    {
        int n ;
        System.out.print("Enter the total number of emails:");
        n = sc.nextInt();
         sc.nextLine();
        String[] emails = new String[n];
        for(int i=0; i<n; i++)
        {
            int a = i+1;
            System.out.print("Enter the "+ a + "th email:");
            emails[i] = sc.nextLine();
        }

        String[] capital_letter=new String[n];
        int ci=0;
        int si=0;
        String[] small_letter=new String[n];;
        for(String s:emails)
        {
            if(s.charAt(0)>='A' && s.charAt(0)<='Z')
            {
                capital_letter[ci] = s;
                ci++;
            }else
            {
                small_letter[si]=s;
                si++;
            }
        }
        System.out.println("All emails that starts with capital letter");
        for(String s:capital_letter)
        {
            if(s==null)break;
            System.out.println(s);
        }
        System.out.println("All emails that starts with small letter");
        for(String s:small_letter)
        {
            if(s==null)break;
            System.out.println(s);
        }
    }
}
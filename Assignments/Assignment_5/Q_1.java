import java.util.Scanner;
// class Question1
// {


//     static Scanner sc = new Scanner(System.in);
//     public static void main(String arg[])
//     {
//         Question1 user1 = new Question1();
//         user1.takeMail();
//     }

//     static void takeMail()
//     {
//         System.out.print("Enter you mail:");
//         String mail = sc.nextLine();
//         if(mail.endsWith("gmail.com") != true)
//         {
//             System.out.println("email domail is not gmail.com");
//         }
//         String arr[] = mail.split("@");
//         if(arr.length>2)
//         {
//             System.out.println("Invalid email:(more than 2 @)");
//             return;
//         }
//         String domain = arr[1];
//         domain = domain.toLowerCase();
//         System.out.println("hello :"+ arr[0]);
       
//         if(domain.equals("gmail.com") == false)
//         {
//             System.out.println("your gmail domain is not as 'gmail.com':" + arr[1]);
//         }
//     }
// }
// second method
class Question1
{   
    static Scanner sc = new Scanner(System.in);
    static boolean count(String s)
    {
        int a = 0;
        for(int i=0; i<s.length(); i++)
        {
            if(s[i]=='@')
            {
                a++;
            }
        }
        if(a>=2 || a==0)
        {
            return true;
        }
        return false;
    }
    public static void mail(String arg[])
    {
         System.out.print("Enter you mail:");
        String mail = sc.nextLine();
        if(mail.endsWith("gmail.com") != true)
        {
            System.out.println("email domail is not gmail.com");
        }
        if(count(mail))
        {
            System.out.println("Invalid mail");
            return ;
        }
        int index = mail.indexOf('@');
        String userName = mail.subString(0,index);
        System.out.println(userName);

    }
}


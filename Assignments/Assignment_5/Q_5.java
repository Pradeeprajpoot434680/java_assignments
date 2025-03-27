import java.util.Scanner;
class Question5
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String arg[])
    {
        String phoneNum ;
        System.out.println("Enter your phone number without (+91):");
        phoneNum = sc.nextLine();
        String ip ;
        System.out.println("Enter your Ip address (xy:abc:eb:p):");
        ip = sc.nextLine();

        //check phoneNum;
         boolean start = phoneNum.substring(0, 1).matches("[6-9]");
        boolean whole = phoneNum.matches("[0-9]{10}");
        if(start && whole)
        {
            System.out.println("Phone number is correct");
        }
        if(start==false)
        {
            System.out.println("Phone number starts with wrong digit");
        }
        if(whole==false)
        {
            System.out.println("Phone number contain other letters except digits or length greater than 10");
        }

        //check ip
       String[] ipArr = ip.split(":");
 
        if(ipArr.length >4)
        {
            System.out.println("worng ip address\n");
            return;
        }
        boolean isValid = true;
        for(String s:ipArr)
        {
            try {
                    int part = Integer.parseInt(s);
                    if (part < 0 || part > 255) {
                        isValid = false;
                    }
                } catch (NumberFormatException e) {
                    isValid = false;
                }
        }
        if(isValid == false)
        {
            System.out.println("Ip is wrong");
        }
        else{
            System.out.println("Ip is correct");
        }
    }
}
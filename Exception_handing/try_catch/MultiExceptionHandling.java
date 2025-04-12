
class MultiExceptionHandling
{
    public static void main(String args[])
    {
        String[] data = {"100","abc",null};
        for(String value:data)
        {
           try
           {
             int num = Integer.parseInt(value);
             System.out.println(num);
           }
           catch(NullPointerException e)
           {
            System.out.println("number was null");
           }
           catch(NumberFormatException e)
           {
            System.out.println("Not a valid number");
           }
        }
    }
}
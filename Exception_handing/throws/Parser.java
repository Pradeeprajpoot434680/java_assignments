class Parser
{
    public static int parseInput(String input) throws NumberFormatException
    {
        return Integer.parseInt(input);
    }
    public static void main(String arg[])
    {
        try{
          int result = parseInput("abc");   
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
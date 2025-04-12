class SleepThread
{
    public static void pause() throws InterruptedException
    {
        Thread.sleep(100);
    }

    public static void main(String arg[])
    {
       try
       {
         pause();
       }
       catch(InterruptedException e)
       {
        System.out.println(e);
       }
       catch(Exception e)
       {
        System.out.println(e);
       }
       System.out.println("Hello");
    }
}
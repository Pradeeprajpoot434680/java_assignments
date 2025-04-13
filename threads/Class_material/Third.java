

class Third extends Thread
{
    public void start()
    {
        super.start();
        System.out.println("Hloo from run method");
    }
    public void run()
    {
       for(int i=0; i<20; i++)
       {
         System.out.println("From run thread");
       }
    }
       
        
    public static void main(String arg[])
    {
        Third obj = new Third();
        obj.start();
        // super.start() //non-static variable super cannot be referenced from a static context
        System.out.println("from the main function");
    }
}
       



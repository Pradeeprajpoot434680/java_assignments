class MyThread4 extends Thread
{
    public void start()
    {
       super.start();
        for(int i=0; i<20; i++)
        {
            System.out.println("Hloo from run method");
        }
    }
    //ovverride the run method
    public void run()
    {
        for(int i=0; i<20; i++)
        {
            System.out.println("Hlo from run method");
        }
    }
}

class Fourth
{
    public static void main(String arg[])
    {
        MyThread4 obj = new MyThread4();
        System.out.println("from the main function");
        obj.start();
    }
}


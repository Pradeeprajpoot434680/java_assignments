class MyThread7 extends Thread
{
    public void run()
    {
        for(int i=0; i<10; i++)
        {
            System.out.println("Hllo from run method "+ i);
            try{
             Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
               
        }
    }
}

class Seventh
{
    public static void main(String arg[])
    {
        MyThread7 obj = new MyThread7();
        MyThread7 obj2 = new MyThread7();

        obj.start();
        obj2.start();
        try
        {
            obj.join(1000);
            obj2.join(1000);
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println("From main thread");
    }
}
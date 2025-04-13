class MyThread2 implements Runnable
{
    public void run()
    {
        for(int i=0; i<100; i++)
        {
            System.out.println("Hello from function");
        }

    }
}

class Second
{
    public static void main(String arg[])
    {
        MyThread obj = new MyThread();
        obj.start();
        for(int i=0; i<100; i++)
        {
            System.out.println("From main function");
        }

    }
}
    
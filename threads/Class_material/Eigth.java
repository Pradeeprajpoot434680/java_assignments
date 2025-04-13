class MyThread8 extends Thread
{
    Thread mainThread;
    MyThread8(Thread mainThread)
    {
        this.mainThread = mainThread;
    }
    public void run()
    {
        System.out.println("child thread is waiting for main thread...");
        try{
            this.join();//it will wait for main thread
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println("child thread finished");
    }
}

class Eight
{
    public static void main(String arg[])
    {
        Thread mainThread = Thread.currentThread();
        MyThread8 obj = new MyThread8(mainThread);
        obj.start();
        for(int i=0; i<10; i++)
        {
            System.out.println("main thread");
        }
        
        System.out.println("main thread finished");

    }
}
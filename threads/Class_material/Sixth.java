//handle the threads
//first method to handle the threads is  yield()

class MyThread6 extends Thread
{
    public void run()
    {
        for(int i=0; i<10; i++)
        {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            Thread.yield();
        }
    }
}
class Sixth
{
    public static void main(String arg[])
    {
        MyThread6 t1 = new MyThread6();
        MyThread6 t2 = new MyThread6();
        t1.setPriority(2);
        t2.setPriority(9);

        t1.start();
        t2.start();
    }
}


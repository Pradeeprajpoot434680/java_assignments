class MyThread5 extends Thread 
{
    public void run() 
    {
        this.setName("Hlo");
        this.setPriority(2);
        System.out.println("Run thread name is: " + this.getName());
        System.out.println("priority of Hlo thread is: " + this.getPriority());
        for (int i = 0; i < 20; i++) 
        {
            System.out.println("This is the run method");
            try 
            {
                Thread.sleep(100); // Handle the InterruptedException here
            } 
            catch (InterruptedException e) 
            {
                System.out.println(e);
            }
        }
    }
}

class Fifth 
{
    public static void main(String arg[]) 
    {
        MyThread5 obj = new MyThread5();
        obj.start(); 
        Thread.currentThread().setPriority(9);
        System.out.println("Main thread name is: " + Thread.currentThread().getName());
        System.out.println("Main thread priority number: " + Thread.currentThread().getPriority());
    }
}

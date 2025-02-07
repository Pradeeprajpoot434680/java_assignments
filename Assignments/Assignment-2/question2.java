class Calculator
{
    static void addIntegers(int a,int b)
    {
        System.out.println("Sum of tow integers is: ");
        System.out.println(a+b);
    }
    static void addRealNumbers(float a,float b)
    {
        System.out.println("Sum of two real numbers is: ");
        System.out.println(a+b);
    }
    public static void main(String arg[])
    {
       addIntegers(4,7);
       addRealNumbers(52.84f, 8737.087f);
    }

}

// PS C:\Users\Dell\Desktop\JAVA\Assignments\Assignment-2> java Calculator         
// Sum of tow integers is: 
// 11
// Sum of two real numbers is:
// 8789.927
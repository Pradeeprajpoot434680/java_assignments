class ComplexNum
{
    float real;
    float img;
    ComplexNum(float a, float b)
    {
        real =a ;
        img = b;
    }
    void showComplexNum()
    {
        System.out.println("Complex number is:  (" + real + " + "+img + "j)");
    }
    void addition(float r1,float img1,float r2,float img2)
    {
        float r3 = r1 + r2;
        float img3 = img1 + img2;
        System.out.println("Sum  is:  (" + r3 + " + "+img3 + "j)");
    }
    void addition( ComplexNum c1,ComplexNum c2)
    {
         float r3 = c1.real + c2.real;
        float img3 = c1.img + c2.img;
        System.out.println("Sum  is:  (" + r3 + " + "+img3 + "j)");
    

    }
    void addition( ComplexNum c)
    {
         float r3 = real + c.real;
        float img3 = img + c.img;
        System.out.println("Sum  is:  (" + r3 + " + "+img3 + "j)");
    

    }

}
class question3
{
    public static void main(String arg[])
    {
        ComplexNum num1 = new ComplexNum(5.2f,8f);
        ComplexNum num2 = new ComplexNum(13.754f,38f);
        num1.showComplexNum();
        num2.showComplexNum();
        num1.addition(45.2f,3f,12f,32f);
        num1.addition(num1,num2);
        num1.addition(num2);
    }
}


// PS C:\Users\Dell\Desktop\JAVA\Assignments\Assignment-2> java question3
// Complex number is:  (5.2 + 8.0j)
// Complex number is:  (13.754 + 38.0j)
// Sum  is:  (57.2 + 35.0j)
// Sum  is:  (18.953999 + 46.0j)
// Sum  is:  (18.953999 + 46.0j)
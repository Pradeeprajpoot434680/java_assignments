class UseComplexNum
{
    public static void main(String arg[])
    {
        ComplexNum c1 = new ComplexNum(20f,43.13f);
        ComplexNum c2 = new ComplexNum(12f,43f);
        ComplexNum c3 = new ComplexNum(6.473f,43);
        ComplexNum c4 = new ComplexNum(12.5f,43.5f);
        c1.showComplexNum();
        c2.showComplexNum();
        c3.showComplexNum();
        c4.showComplexNum();
        c1.addition(c1.real,c1.img,c2.real,c2.img);
        c1.addition(c2,c3);
        c2.addition(c4);


    }
}

// PS C:\Users\Dell\Desktop\JAVA\Assignments\Assignment-2> java UseComplexNum      
// Complex number is:  (20.0 + 43.13j)
// Complex number is:  (12.0 + 43.0j)
// Complex number is:  (6.473 + 43.0j)
// Complex number is:  (12.5 + 43.5j)
// Sum  is:  (32.0 + 86.130005j)
// Sum  is:  (18.473 + 86.0j)
// Sum  is:  (24.5 + 86.5j)
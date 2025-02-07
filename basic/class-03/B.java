class AA
{
    void show( AA obj)
    {
        if(obj instanceof BB)
        {
            System.out.println("from BB");
        }
        else if(obj instanceof CC)
        {
            System.out.println("from cc");
        }else if(obj instanceof DD)
        {
            System.out.println("from DD");
        }else
        {
            System.out.println("from aa");
        }

    }
    
}
class BB extends AA
{

}
class CC extends AA
{

}
class DD extends AA
{

}
class EE
{
    public static void main(String arg[])
    {
        AA ob = new AA();

        AA obj = new BB();
        AA obj1 = new CC();
        AA obj2 = new DD();
        ob.show(obj1);
    }
}
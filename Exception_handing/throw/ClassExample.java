class Rectange
{
    int l,w;
    Rectange(int l,int w)
    {
        this.l = l;
        this.w = w;
    }
    int area() throws Exception//if l or w is negative
    {
        if(l<0 || w<0)
        {
            throw new IllegalArgumentException("Length or width cannot be negative");
        }
        int a = l*w;
        return a;
    }
}

class ClassExample
{
    public static void main(String arg[])
    {
        Rectange r1 = new Rectange(-1,4);
        try{
            System.out.println(r1.area());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
}
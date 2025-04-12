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
        int a = l*w;
        return a;
    }
}

class ClassExample
{
    public static void main(String arg[])
    {
        Rectange r1 = new Rectange(3,4);
        System.out.println(r1.area());
    }
}
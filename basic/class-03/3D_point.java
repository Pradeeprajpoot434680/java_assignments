class Point3D extends Point
{
    int z ;
    // Point p =  new Point();
    void setPoint3D(int x,int y,int z)
    {
    //    p.setPoint(x,y);
        setPoint(x,y);
        // p.showPoint();
        this.z =z;
    }
     void showPoint3D()
    {
        showPoint();
        System.out.println(z);
    }
}
class Test1
{
    public static void main(String arg[])
    {
        // Point3D po = new Point3D();
        // po.setPoint3D(3,4,5);
        // po.showPoint3D();
        Point p = new Point3D();
        // Point p = new Point();
        // p.setPoint(4,5);
        // p.showPoint();
        Point3D p5 = new Point3D();
        // p5.setPoint(6,7);
        // p5.showPoint();
        p5.setPoint3D(5,6,7);
        p5.showPoint3D();

    }
}
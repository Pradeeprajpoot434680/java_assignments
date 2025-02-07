class Point
{
	int x;
	int y;
	void setPoint(int a,int b)
	{
		x =a;
		y =b;
	};
    void showPoint()
    {
        System.out.println("point is : (" + x+","+ y+")");
    }
	
}
class Point3D extends Point
{
    int z;
    Point p;
    void setPoint3D(int x,int y,int z)
    {
        setPoint(x,y);
        this.z = z;
    }
    void show3DPoint()
    {
         System.out.println("point is : (" + x+","+ y+ "," + z + ")");

    }
}
class Hello
{
	public static void main(String arg[])
	{
        Point3D p = new Point3D();
        p.setPoint3D(2,3,4);
        p.show3DPoint();
    }
}
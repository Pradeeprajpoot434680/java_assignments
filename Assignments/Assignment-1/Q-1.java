class Point
{
    int x,y;
    void setPoint(int x,int y)
    {
        this.x  =x;
        this.y = y;
    };
    void showPoint()
    {
        System.out.println("point is: (" + x+","+y+")");
    };
    Point compare(Point p)
    {
        if(Math.abs(x) >Math.abs( p.x))
        {
            return p;
        }else if(Math.abs(x )<Math.abs( p.x))
        {
            return this;
        }else
        {
            System.out.println("both is at the equal distance in x dir:");
            return this;
        }
    }
};
class Question1
{
   public static void main(String arg[])
   {
        Point p1 = new Point();
        p1.setPoint(4,7);
        p1.showPoint();
        Point p2 = new Point();
        p2.setPoint(10,8);
        p2.showPoint();

        Point p3 = p2.compare(p1);
        System.out.println("Point ("+ p3.x + ","+p3.y+") is near to x origin in x direction");
   }
}
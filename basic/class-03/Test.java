//inheritance 
class Point
{
    int x,y;
    void showPoint()
    {
        System.out.println(x);
        System.out.println(y);
    }
    static void setPoint(int x,int y)
    {
        this.x =x;
        this.y =y;
    }
} ;
class Line
{
    Point p1;
    Point p2;
    void setLine(Point p1,Point p2)
    {
        this.p1 = p1;
        this.p2 = p2;
    }
    void showLine()
    {
        System.out.println("Line is ready");
    }
    
}
class Test
{
    public static void main(String arg[])
    {
        Point p1 = new Point();
        Point p2 = new Point();
        Line l = new Line();
        p1.setPoint(3,5);
        p2.setPoint(2,8);
        l.setLine(p1,p2);
        l.showLine();
        
    }
}
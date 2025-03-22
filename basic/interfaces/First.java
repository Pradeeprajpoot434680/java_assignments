interface Shape
{
    void getArea();
    void setColor();
}
class Circle implements Shape
{
    int radii = 10;
    public void getArea()
    {
        System.out.println("Area of the circle :"+3.14*radii*radii);
    }
    public void setColor()
    {
        System.out.println("COlor is red");
    }
}
class Rectangle implements Shape
{
    int l=10;
    int w =9;
    public void getArea()
    {
         System.out.println("Area of the Rectangle :"+l*w);
    }
    public void setColor()
    {
        System.out.println("COlor is blue");
    }
}
class First
{
    public static void main(String arg[])
    {
        Shape ob = new Circle();
        ob.getArea();
        ob.setColor();
        ob = new Rectangle();
        ob.getArea();
        ob.setColor();
    }
}
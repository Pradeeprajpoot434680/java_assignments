class line
{
	point sp, ep;
	void setline(int x1, int y1, int x2, int y2)
	{
		sp = new point();
		ep = new point();
		sp.setpoints(x1,y1);
		ep.setpoints(x2,y2);
	}
	void display()
	{
		sp.showpoints();
		ep.showpoints();
	}
	void setline_by_points(point p1, point p2)
	{
		sp=p1;
		ep=p2;
	}
    double calculateSlope()
	{
		if(ep.x2-sp.x1==0)
			return Double.POSITIVE_INFINITY;
		else
			return (double)(ep.y2-sp.y1)/(ep.x2-sp.x1);
	}
}
class linetest
{
	public static void main(String ar[])
	{
		line l=new line();
		l.setline(3,4,5,6);
		point p1=new point(7,8);
		point p2=new point(9,10);
		l.setline_by_points(p1,p2);
		l.display();
		System.out.println("Slope: " + l.calculateSlope());
	}
}
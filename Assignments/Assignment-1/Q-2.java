
class Question2
{
	public static void main(String arg[])
	{
		
		
		Line l1 = new Line();
		Line l2 = new Line();
		Point p1 = new Point();
		Point p2 = new Point();
		p1.setPoint(2,3);
		p2.setPoint(2,5);
		
		l1.set_line_cordinates_using_points(p1,p2);
		l2.set_line_cordinates_using_coordinates(6,2,9,4);
		
		l1.slope();
		l1.display_line();
		l2.slope();
		l2.display_line();
		l1.starting_ending_points();
		l2.starting_ending_points();
		
	}
}
class Line
{
		
	Point a,b;
	 Line() {
        a = new Point();
        b = new Point();
    }

	void set_line_cordinates_using_points(Point p1,Point p2)
	{
		this.a = p1;
		this.b = p2;
	}
	void set_line_cordinates_using_coordinates(int x1,int y1,int x2,int y2)
	{
		a.x = x1;
		a.y = y1;
		b.x = x2;
		b.y = y2;
	}
	
	void slope()
	{
		if(a.x == b.x)
		{
			System.out.println("Line is parallel to Y - axis");
			return;
		}
		float m = (a.y - b.y)/(float)(a.x - b.x);
		 System.out.println("slope of the line is:"+ m);
	}
	void display_line()
	{
		if(a.x==b.x)
		{
			 System.out.println("The equation of the line is: x = " + a.x);
            return;
		}
		float m = (a.y - b.y)/(float)(a.x - b.x);
		System.out.println("Line is: (y - "+ a.y + ")" + " = " + m + "(x -"+ a.x + ")");
	}
	void starting_ending_points()
	{
		System.out.println("starting point is:("+ a.x + "," + a.y + ")");
		System.out.println("ending point is:("+ b.x + "," + b.y + ")");
	}
	
};


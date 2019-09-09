abstract class Shape{
	abstract void area(int b,int h);
}
class Triangle extends Shape
{
	int x,y;
	Triangle(int b,int h)
	{
		x=b;
		y=h;
	}
	void area(int b,int h)
	{
		System.out.println("Area of the Triangle "+ (.5*b*h));
	}
	
}
class Circle extends Shape
{
	int x,y;
	Circle(int b,int h)
	{
		x=b;
		y=h;
	}
	void area(int b,int h)
	{
		System.out.println("Area of the circle "+ (3.14*b*h));
	}
}
class Ractangle extends Shape
{
	int x,y;
	Ractangle(int b,int h)
	{
		x=b;
		y=h;
	}
	void area(int b,int h)
	{
		System.out.println("Area of the ractangle "+ b*h);
	}
}	
class AbstractShape{
	
	public static void main(String args[]){
		int b =Integer.parseInt(args[0]);
		int h=Integer.parseInt(args[1]);
		int choice=Integer.parseInt(args[2]);
		switch (choice)
		{
			case 1:Triangle t=new Triangle(b,h);
					t.area(b,h);
					break;
			case 2:Circle c=new Circle(b,b);
					c.area(b,b);
					break;
			case 3: Ractangle r=new Ractangle(b,h);
					r.area(b,h);
					break;
			default: System.out.println("Invalid choice");
					break;
		}
	}
}

class shape
{
	void draw()
	{
		System.out.println("I draw Shapes");
	}
	
	void erase()
	{
		System.out.println("I erase Shapes");
	}
}


class circle extends shape
{
	void draw()
	{
		System.out.println("I am Drawing Circle");
	}
	
	void erase()
	{
		System.out.println("I am Erasing Circle");
	}
}

class triangle extends shape
{
	void draw()
	{
		System.out.println("I am drawing Triangle");
	}
	
	void erase()
	{
		System.out.println("I am erasing Triangle");
	}
}

class square extends shape
{
	void draw()
	{
		System.out.println("I am drawing Square");
	}
	
	void erase()
	{
		System.out.println("I am erasing Square");
	}
}


class ques3
{
	public static void main(String args[])
	{
		circle c = new circle();
		square s = new square();
		triangle t = new triangle();
		
		c.draw();
		s.draw();
		t.draw();
		
		System.out.println();
		System.out.println("Each subclass of shape is taking method of shape and ");
		System.out.println("And Overiding the shapes method and making changes accordingly at Run Time");
		System.out.println();
		
		c.erase();
		s.erase();
		t.erase();
		
		System.out.println("This is Run Time Polymorphism");
		
	}
}

public class TurtleFun
{

	public static void main(String[] args)
	{
		double x0=0.54, y0=0.1, heading=50.0, step=2.0/Math.sqrt(3.0)/2;

		Turtle t = new Turtle(x0, y0, heading);
		
		for(int i=0; i<=4; i++)
		{
			t.penDown();
			t.goForward(step);
			t.turnLeft(90.0);
		}
		
		

	}

}

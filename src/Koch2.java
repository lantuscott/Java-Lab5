
public class Koch2
{

	// plot Koch curve of order n, with given step size
	public static void koch(int n, double step, Turtle turtle)
	{
		if (n == 0)
		{
			turtle.goForward(step);
			return;
		}
		koch(n - 1, step, turtle);
		turtle.turnLeft(60.0);
		koch(n - 1, step, turtle);
		turtle.turnLeft(-120.0);
		koch(n - 1, step, turtle);
		turtle.turnLeft(60.0);
		koch(n - 1, step, turtle);
	}

	public static void main(String[] args)
	{
		int order = 3;
		double step = 0.5 / Math.pow(3.0, order);
		Turtle turtle = new Turtle(0.25, 0.25, 60.0);
		koch(order, step, turtle);
		turtle.turnLeft(-120.0);
		koch(order, step, turtle);
		turtle.turnLeft(-120.0);
		koch(order, step, turtle);
		
	}
}
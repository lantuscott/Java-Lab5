
public class Stars
{

	public static void main(String[] args)
	{
		StdOut.print("Enter a number: ");
		int n = StdIn.readInt();
				
		StdOut.println();

			for(int i=0; i<n; i++)
			{
				for(int j=0; j<n; j++)
				{
					StdOut.print("*");
				}
				StdOut.print("\n");
			}
			
			StdOut.println();
			
			for(int i=0; i<n; i++)
			{
				for(int j=i; j>=0; j--)
				{
					StdOut.print("*");
				}
				StdOut.print("\n");
			}
			
			StdOut.println();
			
			for(int i=0; i<n; i++)
			{
				for(int j=i; j<n; j++)
				{
					StdOut.print("*");
				}
				
				StdOut.print("\n");
			}

	}

}

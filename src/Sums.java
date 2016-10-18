
public class Sums
{

	public static void main(String[] args)
	{
		
		StdOut.print("Enter a number (greater than 0): ");
		int n = StdIn.readInt();
		
		int count = 1;
		
		int sum = 0;
		 
		while(count <= n)
		{
			sum = sum + count;			
			count++;
		}
		
		StdOut.println("result (while): " + sum);
		
		count = 1;
		
		sum = 0;
		
		do{
			sum = sum + count;			
			count++;
		}while(count <= n);
		
		StdOut.println("result (do-while): " + sum);
		
		sum = 0;
		
		for(int i=1; i<=n; i++)
		{
			sum = sum + i;
		}

		StdOut.println("result (for): " + sum);
		
	}

}

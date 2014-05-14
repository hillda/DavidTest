
public class DavidTest {

	public static void main(String[] args) {
		
		int result;
		
		result = add(5, 7);
		
		System.out.println("result = " + result);
		
		printloop();

	}
	
	public static int add(int i, int j)
	{
		int theNumber = i + j;
		return (theNumber);
	}
	
	public static void printloop()
	{
		for(int i = 0; i < 10; i++)
		{
			System.out.println("i=" + i);
		}
		
	}

}

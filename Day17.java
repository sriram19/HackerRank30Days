
public class Day17 {

		//Write your code here
		
	int power(int n, int p) throws IllegalArgumentException
	{
	    if((n >= 0) && ( p >= 0))
	        return (int)Math.pow(n,p);
	    else
	    {
	        throw new IllegalArgumentException("n and p should be non-negative");         
	}		  
	}
		

	public static void main(String[] args) {
		{
		
			Day17 d  = new Day17();
			int s=d.power(3, -1);
			System.out.println(s);
		}
	}

}

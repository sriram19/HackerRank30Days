import java.util.Scanner;

public class Day10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int n= sc.nextInt();
			String binary="";
			while(n>0)
			{
				int rem = n %2;
				binary = rem +binary;
				n=n/2;
			}
			System.out.println(binary);
		}
	}

}

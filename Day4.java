import java.util.Scanner;

public class Day4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i =0; i <t;i++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			int n = sc.nextInt();
			double sum=0;
			double power=0;
			for(int j=0;j<n;j++)
			{
				
				sum = a + (Math.pow(2, j) * b) + power;
				power = power+(Math.pow(2, j)) * b;
				
				System.out.print(Math.round(sum));
				System.out.print(" ");
				
			}
			
		}
	}

}

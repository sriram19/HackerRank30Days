import java.util.Scanner;
import java.util.StringTokenizer;

public class Day21 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(s, " ![,?.\\_'@+]");
		System.out.println(st.countTokens());
		while(st.hasMoreTokens())
		{
			
			System.out.println(st.nextToken());
			
		}
		
	}

}

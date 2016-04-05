import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Day8 {


	public static Map<String,Integer> phoneMap = new HashMap<String,Integer>();
			
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++)
		{
             String s= sc.nextLine();
		       int num = sc.nextInt();
			phoneMap.put(s, num);
			sc.nextLine();
			
		}
		//String q = sc.nextLine();
		while(sc.hasNext())
		{
			String s1 = sc.nextLine();
			if(phoneMap.containsKey(s1))
			{
			System.out.println(s1+"="+phoneMap.get(s1));
			}
			else
			{
				System.out.println("Not found");
			}
		}
	}

}

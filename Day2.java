import java.util.Scanner;

public class Day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	      Scanner sc = new Scanner(System.in);
	      double M = sc.nextDouble(); // original meal price
	      int T = sc.nextInt(); // tip percentage
	      int X = sc.nextInt(); 
	      
	      
	      double tip=0.0,tax=0.0;
	      int finalprice=0;
	      
	      tip = (M * T) /100.0;
	      tax = (M * X)/100.0;
	      
	      finalprice = (int) Math.round(tip + tax + M);
	      
	      System.out.println("The final price of the meal is $"+finalprice+".");

	}
	

}

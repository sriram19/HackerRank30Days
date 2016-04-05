import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n = sc.nextInt();
int[] arr = new int [n];
for(int i=0;i<n;i++)
{
	arr[i]= sc.nextInt();
}
	    Arrays.sort(arr);
	    int abs = Integer.MAX_VALUE;
	    for (int i = arr.length - 1; i > 0; i--)
	        if(arr[i] - arr[i-1] < abs)
	            abs = arr[i] - arr[i-1];
	    for (int i = 1; i < arr.length - 1; i++) 
	        if(arr[i] - arr[i-1] == abs)
	            System.out.print(arr[i-1] + " " + arr[i] + " ");
	}

}

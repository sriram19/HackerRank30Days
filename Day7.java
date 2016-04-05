import java.util.Scanner;

public class Day7 {

	public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int arr[] = new int[N];
        for(int i=0; i < N; i++){
            arr[i] = in.nextInt();
        }
        for(int j=arr.length-1;j>=0;j--)
        {
        	System.out.print(arr[j]);
        	System.out.print(" ");
        }
        
	}

}

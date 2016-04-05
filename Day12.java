	import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;


	class Student{
	   protected String firstName;
	   protected String lastName;
	   int phone;
	   Student(String fname,String lname,int p){
	         firstName=fname;
	         lastName=lname;
	         phone=p;
	       
	   }
	   
	   public void display(){// display the details of the student
	       System.out.println("First Name: "+firstName+"\nLast Name: "+lastName+"\nPhone: "+phone); 
	   }

	}
	class Grade extends Student{
		   private int score;
		   private String firstName;
		    private String lastName;
		    private int phoneNo;
		public  Grade(String firstName,String lastName,int phoneNo,int score)
		     {
			 super(firstName, lastName, phoneNo);
		     this.firstName= firstName;
		     this.lastName=lastName;
		     this.phoneNo =phoneNo;
		     this.score= score;
		 }

			public char calculate()
		        {
		        char c='\0';
		        if(score<40)
		            {
		            c='D';
		        }
		        else if(score >=40 && score <60)
		            {
		            c='E';
		        }
		        else if (score >=60 && score <75)
		            {
		            c='A';
		        }
		        else if (score>=75 && score <90)
		            {
		            c='B';
		        }
		        else if (score >=90 && score <=100)
		            {
		            c='O';
		        }
		        return c;
		    }
		}
	public class Day12 {

	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        String firstName=sc.nextLine();
	        String lastName=sc.nextLine();
	        int phone=sc.nextInt();
	        int score=sc.nextInt();
	        Student stu=new Grade(firstName,lastName,phone,score);
	        stu.display();
	        Grade g=(Grade)stu;
	        System.out.println("Grade: "+g.calculate());
	        
	    }
	}
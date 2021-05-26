import java.util.Scanner;

public class Factorial {

	public Factorial() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int i,fact=1,num;
		
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter a no");
		 num=sc.nextInt();
		 
		 for(i=1;i<=num;i++)
		   
		      fact=fact*i;  
System.out.println("fact="+fact);
	}

}

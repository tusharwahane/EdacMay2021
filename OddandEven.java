import java.util.Scanner;

public class OddandEven {

	public OddandEven() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num;

Scanner sc= new Scanner(System.in);
System.out.println("enter a number to check ");
		num=sc.nextInt();
if ( num % 2 == 0 )
{		
System.out.println("number is even");		
}
else
{
System.out.println("number is odd");		
		
	}

	}
}

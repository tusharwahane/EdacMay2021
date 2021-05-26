import java.util.Scanner;

public class Palindrome {

	public Palindrome() {

	}
	public static void main(String[] args) {
	
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number to check");
			
int num=sc.nextInt();
int orgno=num;
int rev=0;

while (num!=0)
{
	rev=rev*10 + num%10;
	num=num/10;
}

if(orgno==rev)
{
	System.out.println("no is palindrome"+orgno);
}
	
else {
	System.out.println("no is not palindrome"+orgno);
}
	
	
	
	

	}

}

import java.util.Scanner;

public class primecal {

	public primecal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		System.out.println("enter a number");
		Scanner sc =new Scanner(System.in);
	int n=sc.nextInt();
		
		primecalc(n);
	}
		static void primecalc(int num)
		{
			int count=0;
			for (int i=1;i<=num;i++)
			{
				if(num%i==0)
				{
					count++;
				}
			}
			if (count==2)
				
			
			
					
					System.out.println("prime no");
			else 
				System.out.println("not prime");		
		
		
	}

}

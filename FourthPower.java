import java.util.Scanner;

public class FourthPower {

	public FourthPower() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) 
	{
int base,expo,power=1;
Scanner sc=new Scanner(System.in);

System.out.println("enter base number");
base=sc.nextInt();

System.out.println("enter expo");
expo=sc.nextInt();

for(int i=1;i<=expo;i++)
{
	power=base*power;

System.out.println("power="+power);
}		
	}		
		
	}



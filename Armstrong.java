
public class Armstrong {

	public Armstrong() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
int c=0,a,temp;
int n=153;
temp=n;
while(n>0)
{
	a=n%10;
	n=n/10;
	c=c+(a*a*a);
	
}
if (temp==c)
	System.out.println("it is armongstrong");	
else
      System.out.println("its not "); 

	}
		
		
		
	}



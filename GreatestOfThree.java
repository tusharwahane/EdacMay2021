
public class GreatestOfThree {

	public GreatestOfThree() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num1 = 10, num2 = 20, num3 = 40;

	      if( num1 >= num2 && num1 >= num3)
	          System.out.println(num1+" is the largest Number");

	      else if (num2 >= num1 && num2 >= num3)
	          System.out.println(num2+" is the largest Number");

	      else
	          System.out.println(num3+" is the largest Number");
	}

}

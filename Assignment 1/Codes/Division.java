import java.util.*;
class Division{
	
	private static Integer divide(int numerator, int denominator){
		int sign;
		int result=0;
		
		if (numerator<0)
		{
			if (denominator<0)
			sign=1;
			else
			sign=-1;
		}
		else
		{
			if (denominator<0)
			sign=-1;
			else
			sign=1;
		}

		denominator = Math.abs(denominator);
		numerator = Math.abs(numerator); 
		
		while(numerator >= denominator)
		{
			numerator -= denominator;
			result++;
		}
		result = result * sign;
		return result;
	}

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num, den;
		System.out.print("Enter numerator: ");
		num = sc.nextInt();
		System.out.print("Enter denominator : ");
		den = sc.nextInt();
		System.out.println("Result: " + Division.divide(num, den));
        sc.close() ;
	}
}

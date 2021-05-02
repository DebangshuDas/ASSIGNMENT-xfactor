import java.util.*;
class Angle{
	public double findAngle(int hour, int minute)
	{
		double hrhand, minhand, result;
		
		if(hour < 0 || minute < 0 || hour > 12 || minute > 60)
			return -1;
		if (hour == 12)
			hour = 0;
		if (minute == 60)
		{
			minute = 0;
			hour++;
			if (hour>12)
				hour = hour-12;
		}
		
		hrhand = (hour * 60 + minute) * 0.5;
		minhand = minute * 6;
		result = Math.abs(hrhand - minhand);
		if (360-result > result)
			return result;
		return 360-result;
	}

	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		int hour, min;
		double result;
		System.out.print("Hour : ");
		hour = sc.nextInt();
		System.out.print("Minute : ");
		min = sc.nextInt();
		Angle ob = new Angle();
		result = ob.findAngle(hour, min);
		
		if(result == -1)
			System.out.println("Wrong Input");
		else
			System.out.println("Angle is: " + result+" degrees");
	} 
}
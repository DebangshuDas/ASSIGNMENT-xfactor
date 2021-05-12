import java.util.*;

class FindAngle
{
	double calcAngle(int h, int m)
	{
		if(h<0 || m<0 || h>12 || m>60)
			return -1;
		if (h == 12)
			h = 0;
		if (m == 60)
		{
			m = 0;
			h+=1;
			if (h>12)
				h = h-12;
		}
		
		double hour_hand = (h * 60 + m) * 0.5;
		double min_hand = m * 6;
		double angle = Math.abs(hour_hand - min_hand);
		angle = Math.min(360-angle,angle);
        return angle;
	}

	public static void main(String args[])
    {
		Scanner sc= new Scanner(System.in);
		int hour, min;
		double angle;
		System.out.print("Hour : ");
		hour = sc.nextInt();
		System.out.print("Minute : ");
		min = sc.nextInt();
		FindAngle ob = new FindAngle();
		angle = ob.calcAngle(hour, min);
		
		if(angle == -1)
			System.out.println("Wrong Input");
		else
			System.out.println("Angle is: " + angle+" degrees");
        sc.close();
	} 
}
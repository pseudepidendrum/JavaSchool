public class Kinematic // Exercise 1.2.22
{
	public static void main(String[] args)
	{
		double inPos = Double.parseDouble(args[0]);
		double inVel = Double.parseDouble(args[1]);
		double time  = Double.parseDouble(args[2]);
		
		double g = 9.80665; // The constant acceleration caused by Earth's gravity
		
		double velocity     = inVel * time;
		double t = time * time;
		double acceleration = (g * t) / 2;
		double value = inPos + velocity - acceleration;
		
		System.out.println(value);
	}
}
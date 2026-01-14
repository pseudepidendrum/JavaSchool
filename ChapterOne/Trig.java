public class Trig
{
	public static void main(String[] args)
	{
		double theta = Double.parseDouble(args[0]);
		double sinValue = Math.sin(theta);
		double cosValue = Math.cos(theta);
		double value = cosValue * cosValue + sinValue * sinValue;
		System.out.println(value);
	}
}
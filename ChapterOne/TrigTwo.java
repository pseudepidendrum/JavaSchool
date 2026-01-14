public class TrigTwo
{
	public static void main(String[] args)
	{
		double t = Double.parseDouble(args[0]);
		double sinValueOne = Math.sin(2 * t);
		double sinValueTwo = Math.sin(3 * t);
		
		double value = sinValueOne + sinValueTwo;
		System.out.println(value);
	}
}
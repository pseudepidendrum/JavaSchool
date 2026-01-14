public class Divid // Exercise 1.2.14
{
	public static void main(String[] args)
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt (args[1]);
		boolean isEven;
		isEven = (a % b == 0);
		isEven = isEven || (b % a == 0);
		System.out.println(isEven);
	}
}
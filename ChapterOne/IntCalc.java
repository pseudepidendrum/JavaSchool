public class IntCalc // Exercise 1.2.24
{
	public static void main(String[] args)
	{
		double principal = Double.parseDouble(args[0]);
		double rate      = Double.parseDouble(args[1]);
		double time      = Double.parseDouble(args[2]);
		
		double interest = principal * Math.exp(rate * time);
		
		System.out.println(interest);
	}
}
		// use Math.E
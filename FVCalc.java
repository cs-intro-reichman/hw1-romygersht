// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		
		int currenValue = Integer.parseInt(args[0]); 
		double rate = Double.parseDouble(args[1]); 
		int n = Integer.parseInt(args[2]); // number of years

		double nn = Double.valueOf(n); // switching the number of years to double so it will fit to the math.pow
		double rateF = 1+rate/100; //calculating for the furmula + making the rate as a precentage
		double futureValue = currenValue * Math.pow (rateF,nn); // calculating the future value according to the formula using the math.pow
		
		System.out.println ("After 2 years, $"+currenValue+" saved at %"+rate+" will yield $"+(int) futureValue);

	}
}
// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]); //the limit; input as an integer

		double a = lim*Math.random(); //math random returns a random value from 0.0 to 1.0; i multiplied it by the limit number, to change the range
		double b = lim*Math.random(); 
		double c = lim*Math.random(); 
		//creating 3 random numbers

		double min1 = Math.min (a,c); 
		double min2 = Math.min (a,b);
		double minF = Math.min (min1,min2); //after findind the 2 smalls numbers between the 3, doing the same action on them to find the smallest one 

		double max1 = Math.max (a,c);
		double max2 = Math.max (a,b);
		double maxF = Math.max (max1,max2); //the same as i did to find the minimum

        double mid = (a+b+c) - (minF+maxF); //findind the middlle number - subtract from the sum of the 3 randon numbers, the sum of the 2 numbers i know; the biggest and the smallest 
                  

		System.out.println (+(int)a+" "+(int)b+" "+(int)c); //printing the numbers randomly as the where
		System.out.println (+(int)minF+" "+(int)mid+" "+(int)maxF); //printing the numbers followed by the same number in ascending order

	}
}

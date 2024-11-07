// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
    int num = Integer.parseInt(args[0]); // creating a single integer input

	int h = num/100; // spliting to get only the value of the handreds
	int t = num/10; t = t - h*10; // spliting to get only the value of the hundreds and tens, then subtract the hundreds
	int o = num; // creating an integer for the ones
	double d = Double.valueOf(o); // switching it to double
	d = d/10; d = d - h*10; d = d*10; d = d-t*10; // doing the same as i did to t, but now in double so that the number after the decimal point wiil stay. than, multiplied it in ten, and subtract the tens.

	System.out.println(+h+" handreds, "+t+" tens, and "+(int) d+" ones");

	}
}

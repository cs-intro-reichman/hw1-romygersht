// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
    int num = Integer.parseInt(args[0]); // creating a single integer input

	int h = num/100; // spliting to get only the value of the handreds
	int t = num/10; t = t - h*10; // spliting to get only the value of the hundreds and tens, then subtract the hundreds
    int o = num - h*100; o = o - t*10; // subtract from the number the hundreds digit*100, and then the tens digit*10
	System.out.println(+h+" hundreds, "+t+" tens, and "+o+" ones.");
	}
}

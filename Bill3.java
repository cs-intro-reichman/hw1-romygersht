// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
	    String name1 = args [0];
		String name2 = args [1]; // creating places in the arg for all the 3 members
		String name3 = args [2];

		int Sum = Integer.parseInt(args[3]); // creating place to tha sum
		Double billSum = Double.valueOf(Sum); // change the int value to double

		billSum= billSum/3; //split the sum to 3

		double billSumF = Math.ceil(billSum); //the action that rounds up double 

		System.out.println ("dear " +name1+ ", " +name2+ ", and " +name3+": pay " +billSumF+ " shekels each."); // printing the names and the final bill sum
	}
}

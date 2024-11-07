// Prints the numbers 0 to 5.
// (Same program as shown in lecture 1-1).
public class Demo0 { // the name of the class must be the same as the name of the file - compile eror
	public static void main(String[] args) { // these lines must follow to the  syntax rules 
		// Declares an int variable, and sets it to 1
        int i = 0;
        // Complete the program's code here:
        while (i < 6) {
          // printing the value of i
            System.out.println(i);
          //adding 1 to the value of i
            i=i+1;
        }
        System.out.println("Done"); //inside the quotation there are no rules for typing latters or numbers; the quotation must be from both sides (open and close)
        //after printing all the numbers from 0 to 5, printing "done"
        //for printing the value of a symbol, for example i in this program, it just needed to be write inside with no quotation
    }
 }